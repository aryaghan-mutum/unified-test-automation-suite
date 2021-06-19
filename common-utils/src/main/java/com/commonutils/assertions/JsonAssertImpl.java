package com.commonutils.assertions;

import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.context.annotation.Description;

@Slf4j
public enum JsonAssertImpl implements JsonAssert {

    SINGLETON;

    private static final String PASS = "Assertion Passed, ";
    private static final String FAIL = "Assertion Failed, ";
    private static final String EXPECTED_JSON = "Expected JSON: ";
    private static final String ACTUAL_JSON = "Actual JSON: ";

    @Override
    @Description("Validate if both the JSONs are not matching. if they don't match then the test will fail, pass otherwise")
    public void assertEquals(String expectedJson, String actualJson) {
        try {
            JSONAssert.assertEquals(expectedJson, actualJson, true);
            log.info(PASS + getDetailMessage(expectedJson, actualJson));
        } catch (JSONException | AssertionError e) {
            log.info(FAIL + getDetailMessage(expectedJson, actualJson));
            TestCase.fail(ExceptionUtils.getStackTrace(e));
        }
    }

    @Override
    @Description("Validate if both the JSONs are matching. if they don't match then the test will pass, fail otherwise")
    public void assertNotEquals(String expectedJson, String actualJson) {
        try {
            JSONAssert.assertNotEquals(expectedJson, actualJson, true);
            log.info(PASS + getDetailMessage(expectedJson, actualJson));
        } catch (JSONException | AssertionError e) {
            log.info(FAIL + getDetailMessage(expectedJson, actualJson));
            TestCase.fail(ExceptionUtils.getStackTrace(e));
        }
    }

    @Description("Return a message for assertion methods when called")
    private String getDetailMessage(String expectedJson, String actualJson) {
        return EXPECTED_JSON + expectedJson + ACTUAL_JSON + actualJson;
    }
}

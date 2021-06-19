package com.commonutils.assertions;

import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;

@Slf4j
public enum JsonAssertImpl implements JsonAssert {

    SINGLETON;

    private static final String PASS = "Assertion Passed, ";
    private static final String FAIL = "Assertion Failed, ";
    private static final String EXPECTED_JSON = "Expected JSON: ";
    private static final String ACTUAL_JSON = "Actual JSON: ";
    private static final String STRICT_MODE = "StrictMode enabled: ";

    @Override
    public void assertEquals(String expectedJson, String actualJson, boolean isStrictModeEnabled) {
        try {
            JSONAssert.assertEquals(expectedJson, actualJson, isStrictModeEnabled);
            log.debug(PASS + getDetailMessage(expectedJson, actualJson, isStrictModeEnabled));
        } catch (JSONException | AssertionError e) {
            log.debug(PASS + getDetailMessage(expectedJson, actualJson, isStrictModeEnabled));
            TestCase.fail(ExceptionUtils.getStackTrace(e));
        }
    }

    @Override
    public void assertNotEquals(String expectedJson, String actualJson, boolean isStrictModeEnabled) {
        try {
            JSONAssert.assertNotEquals(expectedJson, actualJson, isStrictModeEnabled);
            log.debug(PASS + getDetailMessage(expectedJson, actualJson, isStrictModeEnabled));
        } catch (JSONException | AssertionError e) {
            log.debug(PASS + getDetailMessage(expectedJson, actualJson, isStrictModeEnabled));
            TestCase.fail(ExceptionUtils.getStackTrace(e));
        }
    }

    private String getDetailMessage(String expectedJson, String actualJson, boolean isStrictModeEnabled) {
        return STRICT_MODE + isStrictModeEnabled + EXPECTED_JSON + expectedJson + ACTUAL_JSON + actualJson;
    }
}

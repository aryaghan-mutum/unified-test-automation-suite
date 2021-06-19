package com.selenium;

import org.junit.jupiter.api.Test;

public class JsonAssertionUtilTest {

    private static final String jsonObj1 = "";
    private static final String jsonObj2 = "";
    private static final String jsonObj3 = "";
    private static final String jsonObj4 = "";

    private static final String jsonArray1 = "";
    private static final String jsonArray2 = "";
    private static final String jsonArray3 = "";

    private static final String jsonArrayOfObjects1 = "";
    private static final String jsonArrayOfObjects2 = "";
    private static final String jsonArrayOfObjects3 = "";

    /**
     * Test Objects
     */
    @Test
    public void testJsonAssertEqualsObjectMatchPass() {
        JsonAssert.IMPL.assertEquals(jsonObj1, jsonObj2, false);
    }

    @Test
    public void testJsonAssertEqualsObjectMatchFail() {
        JsonAssert.IMPL.assertEquals(jsonObj1, jsonObj3, false);
    }

    /**
     * Test Arrays
     */

    /**
     * Test Arrays of Objects
     */

    @Test
    public void testJsonAssertEqualsArrayOfObjectsMatchPass() {
        JsonAssert.IMPL.assertEquals(jsonArrayOfObjects1, jsonArrayOfObjects3, false);
    }

    @Test
    public void testJsonAssertEqualsArrayOfObjectsMismatchMissingValueFail() {
        JsonAssert.IMPL.assertEquals(jsonArrayOfObjects3, jsonArrayOfObjects1, false);
    }

    @Test
    public void testJsonAssertNotEqualsArrayOfObjectsMismatchPass() {
        JsonAssert.IMPL.assertNotEquals(jsonArrayOfObjects3, jsonArrayOfObjects1, false);
    }

    @Test
    public void testJsonAssertNotEqualsArrayOfObjectsMismatchFail() {
        JsonAssert.IMPL.assertNotEquals(jsonArrayOfObjects1, jsonArrayOfObjects1, false);
    }



}

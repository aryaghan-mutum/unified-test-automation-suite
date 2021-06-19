package com.commonutils.assertions;

public interface JsonAssert {

    JsonAssert IMPL = JsonAssertImpl.SINGLETON;

    void assertEquals(String expectedJson, String actualJson);

    void assertNotEquals(String expectedJson, String actualJson);

}

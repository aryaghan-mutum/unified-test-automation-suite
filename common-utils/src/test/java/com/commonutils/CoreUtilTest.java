package com.commonutils;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoreUtilTest {

    @Test
    @Step("test method name")
    public void testGetMethodName() {
        Assertions.assertEquals(CoreUtil.getMethodName(), "testGetMethodName");
    }

    @Test
    @Step("test method by using depth/path of the tree")
    public void testGetMethodNameByDepth() {
        Assertions.assertEquals(CoreUtil.getMethodNameByDepth(-1), "getMethodNameByDepth");
        Assertions.assertEquals(CoreUtil.getMethodNameByDepth(0), "testGetMethodNameByDepth");
    }

    @Test
    @Step("test method by using depth/path of the tree")
    public void testGetMethodNameColonSpace() {
        Assertions.assertEquals(CoreUtil.getMethodNameColonSpace(-1), "getMethodNameColonSpace: ");
        Assertions.assertEquals(CoreUtil.getMethodNameColonSpace(0), "testGetMethodNameColonSpace: ");
    }

    @Test
    @Step("test class name")
    public void testGetClassName() {
        Assertions.assertEquals(CoreUtil.getClassName(), "CoreUtilTest");
    }

    @Test
    @Step("test class by using depth/path of the tree")
    public void testGetClassNameByDepth() {
        Assertions.assertEquals(CoreUtil.getClassNameByDepth(-1), "com.commonutils.CoreUtil");
        Assertions.assertEquals(CoreUtil.getClassNameByDepth(0), "com.commonutils.CoreUtilTest");
        Assertions.assertEquals(CoreUtil.getClassNameByDepth(1), "jdk.internal.reflect.NativeMethodAccessorImpl");
        Assertions.assertEquals(CoreUtil.getClassNameByDepth(2), "jdk.internal.reflect.NativeMethodAccessorImpl");
        Assertions.assertEquals(CoreUtil.getClassNameByDepth(3), "jdk.internal.reflect.DelegatingMethodAccessorImpl");
        Assertions.assertEquals(CoreUtil.getClassNameByDepth(4), "java.lang.reflect.Method");
    }
}

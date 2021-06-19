package com.commonutils;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberUtilTest {

    @Test
    @Step("test isInteger method")
    public void testIsInteger() {
        Assertions.assertEquals(NumberUtil.isInteger("i am string"), false);
        Assertions.assertEquals(NumberUtil.isInteger("1"), true);
        Assertions.assertEquals(NumberUtil.isInteger("1.234"), false);
    }

    @Test
    @Step("test testIsLong method")
    public void testIsLong() {
        Assertions.assertEquals(NumberUtil.isLong("i am string"), false);
        Assertions.assertEquals(NumberUtil.isLong("1"), true);
        Assertions.assertEquals(NumberUtil.isLong("1.234"), false);
    }

    @Test
    @Step("test testToInteger method")
    public void testToInteger() {
        Assertions.assertThrows(NumberFormatException.class, () -> NumberUtil.toInteger("i am string"));
        Assertions.assertEquals(NumberUtil.toInteger("1"), 1);
        Assertions.assertThrows(NumberFormatException.class, () -> NumberUtil.toInteger("1.234"));
    }

    @Test
    @Step("test testToLong method")
    public void testToLong() {
        Assertions.assertThrows(NumberFormatException.class, () -> NumberUtil.toInteger("i am string"));
        Assertions.assertEquals(NumberUtil.toLong("101010"), 101010);
        Assertions.assertThrows(NumberFormatException.class, () -> NumberUtil.toInteger("1.234"));
    }
}

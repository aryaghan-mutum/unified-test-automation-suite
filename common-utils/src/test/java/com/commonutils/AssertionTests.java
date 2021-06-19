package com.commonutils;

import com.commonutils.assertions.JsonAssert;
import org.junit.jupiter.api.Test;

public class AssertionTests {

	@Test
	void testForMatchingJsonsUsingAssertEquals() {
		String actual = "'{\"name\":\"Joe\", \"age\":36, \"car\":null}'";
		String expected = "'{\"name\":\"Joe\", \"age\":36, \"car\":null}'";
		JsonAssert.IMPL.assertEquals(expected, actual);
	}

	@Test
	void testForUnMatchingJsonsUsingAssertEquals() {
		String actual = "'{\"name\":\"Joe\", \"age\":36, \"car\":null}'";
		String expected = "'{\"name\":\"Matt\", \"age\":34, \"car\":null}'";
		JsonAssert.IMPL.assertEquals(expected, actual);
	}

	@Test
	void testForMatchingJsonsUsingAssertNotEquals() {
		String actual = "'{\"name\":\"Joe\", \"age\":36, \"car\":null}'";
		String expected = "'{\"name\":\"Joe\", \"age\":36, \"car\":null}'";
		JsonAssert.IMPL.assertNotEquals(expected, actual);
	}

	@Test
	void testForUnMatchingJsonsUsingAssertNotEquals() {
		String actual = "'{\"name\":\"Joe\", \"age\":36, \"car\":null}'";
		String expected = "'{\"name\":\"Matt\", \"age\":34, \"car\":null}'";
		JsonAssert.IMPL.assertNotEquals(expected, actual);
	}

}

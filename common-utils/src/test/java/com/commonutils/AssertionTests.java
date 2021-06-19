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

	//////////////////////

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

	@Test
	@Deprecated
	public void testJsonAssertEqualsObjectMatchPass() {
		JsonAssert.IMPL.assertEquals(jsonObj1, jsonObj2);
	}

	@Test
	@Deprecated
	public void testJsonAssertEqualsObjectMatchFail() {
		JsonAssert.IMPL.assertEquals(jsonObj1, jsonObj3);
	}

	@Test
	@Deprecated
	public void testJsonAssertEqualsArrayOfObjectsMatchPass() {
		JsonAssert.IMPL.assertEquals(jsonArrayOfObjects1, jsonArrayOfObjects3);
	}

	@Test
	@Deprecated
	public void testJsonAssertEqualsArrayOfObjectsMismatchMissingValueFail() {
		JsonAssert.IMPL.assertEquals(jsonArrayOfObjects3, jsonArrayOfObjects1);
	}

	@Test
	@Deprecated
	public void testJsonAssertNotEqualsArrayOfObjectsMismatchPass() {
		JsonAssert.IMPL.assertNotEquals(jsonArrayOfObjects3, jsonArrayOfObjects1);
	}

	@Test
	@Deprecated
	public void testJsonAssertNotEqualsArrayOfObjectsMismatchFail() {
		JsonAssert.IMPL.assertNotEquals(jsonArrayOfObjects1, jsonArrayOfObjects1);
	}

}

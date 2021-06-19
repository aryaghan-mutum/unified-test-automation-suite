package com.commonutils;

public class NumberUtil {

    public static boolean isInteger(final String inStr) {
        try {
            Integer.parseInt(inStr);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isLong(final String inValue) {
        try {
            Long value = Long.parseLong(inValue);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Integer toInteger(final String inString) {
        if (inString == null) {
            return null;
        } else {
            return Integer.parseInt(inString);
        }
    }

    public static Long toLong(final String inString) {
        if (inString == null) {
            return null;
        } else {
            return Long.parseLong(inString);
        }
    }
}

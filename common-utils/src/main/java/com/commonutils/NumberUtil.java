package com.commonutils;

import org.springframework.context.annotation.Description;

public class NumberUtil {

    @Description("Return true if the input value is an integer, false otherwise")
    public static boolean isInteger(final String inStr) {
        try {
            Integer.parseInt(inStr);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Description("Return true if the input value is long, false otherwise")
    public static boolean isLong(final String inValue) {
        try {
            Long.parseLong(inValue);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Description("Convert to integer. If the string value is null then return null, integer otherwise")
    public static Integer toInteger(final String inString) {
        if(inString == null) {
            return null;
        }else {
          return Integer.parseInt(inString);
        }
    }

    @Description("Convert to integer. If the string value is null then return null, long otherwise")
    public static Long toLong(final String inString) {
        return inString == null ? null : Long.parseLong(inString);
    }
}

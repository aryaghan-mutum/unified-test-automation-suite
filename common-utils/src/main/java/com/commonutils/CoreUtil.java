package com.commonutils;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.InvocationTargetException;

public class CoreUtil {

    /**
     * Get the Class name from call stack
     */
    public static String getSimpleClassName() {
        String returnValue = null;
        int iPos = 0;
        returnValue = Thread.currentThread().getStackTrace()[2].getClassName();

        if (returnValue != null) {
            iPos = StringUtils.lastIndexOf(returnValue, ".");

            if (iPos > 0) {
                returnValue = returnValue.substring(iPos + 1);
            }
        }

        return returnValue;
    }

    /**
     * Get the method name for a depth in call stack.
     * @param depth depth in the class stack (0 means current method, 1 means call method, ...)
     */
    private static String getMethodName(final int depth) {
        String returnValue = null;
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        returnValue = ste[2 + depth].getMethodName();
        return returnValue;
    }

    public static String getClassName(final int depth) {
        String returnValue = null;
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        returnValue = ste[2 + depth].getClassName();
        return returnValue;
    }

    public static String getMethodNameColonSpace(final int depth) {
        String returnValue = null;
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        returnValue = ste[2 + depth].getMethodName() + ":" + " ";
        return returnValue;
    }
}

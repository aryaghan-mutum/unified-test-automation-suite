package com.commonutils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Description;

public class CoreUtil {

    @Description("Get the class name from call stack")
    public static String getClassName() {
        int iPos = 0;
        String className;
        className = Thread.currentThread().getStackTrace()[2].getClassName();

        if (className != null) {
            iPos = StringUtils.lastIndexOf(className, ".");

            if (iPos > 0) {
                className = className.substring(iPos + 1);
            }
        }

        return className;
    }

    @Description("Get the class name by depth")
    public static String getClassNameByDepth(final int depth) {
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        final String className = ste[2 + depth].getClassName();
        return className;
    }

    @Description("Get the method name from call stack")
    public static String getMethodName() {
        final int depth = 0;
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        final String methodName = ste[2 + 0].getMethodName();
        return methodName;
    }

    @Description("Get the method name for a depth in call stack. @param depth: In the class stack (0 means current method, 1 means call method, ...")
    public static String getMethodNameByDepth(final int depth) {
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        final String methodName = ste[2 + depth].getMethodName();
        return methodName;
    }

    @Description("Get the method name with colon space")
    public static String getMethodNameColonSpace(final int depth) {
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        final String methodName = ste[2 + depth].getMethodName() + ":" + " ";
        return methodName;
    }
}

package com.logger.logging;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.Logger;

public class LogHandler {

    private static final Logger log = null;

    /**
     * Printing to Debug file
     */
    public static void debugPrintTestInitHeader() {
        String testName = Thread.currentThread().getStackTrace()[2].getMethodName();
        log.debug("**********************************");
        log.debug("Starting Test: {}", testName);
    }

    public static void debugPrintHeader(String header) {
        log.debug("****************" + header + "****************");
    }

    public static void debugPrintLocalizationHeader(String language) {
        String testName = Thread.currentThread().getStackTrace()[2].getMethodName();
        log.debug("**********************************");
        log.debug("Starting Test: {}", testName);
        log.debug("Language" + language);
    }

    public static void debugPrintTestFinishedHeader() {
        log.debug("Test Complete");
        log.debug("**********************************");
    }

    private static void debugPrint(String message) {
        debugPrint(0, message);
    }

    public static void debugPrint(int indentLevel, String message) {
        if (indentLevel == 0) {
            log.debug(message);
        } else {
            log.debug(StringUtils.repeat("\t", indentLevel) + message);
        }
    }

    public static void debugPrint(String message, Object... args) {
        debugPrint(0, message, args);
    }

    public static void debugPrint(int indentLevel, String message, Object... args) {
        if (indentLevel == 0) {
            log.debug(message, args);
        } else {
            log.debug(StringUtils.repeat("\t", indentLevel) + message, args);
        }
    }
}

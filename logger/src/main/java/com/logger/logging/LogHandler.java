package com.logger.logging;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Description;

@Slf4j
public class LogHandler {

    @Description("Prints header name")
    public static void logHeader(String header) {
        log.info("******************" + header + "******************");
    }
    
    @Description("Prints Test Starts")
    public static void logTestStarts() {
        String testName = Thread.currentThread().getStackTrace()[2].getMethodName();
        log.info("************************************");
        log.info("Starting Test: {}", testName);
    }

    @Description("Prints Test Ends")
    public static void logTestEnds() {
        log.info("Test End");
        log.info("************************************");
    }

    @Description("Prints language and header name")
    public static void logLangHeader(String language) {
        String testName = Thread.currentThread().getStackTrace()[2].getMethodName();
        log.info("************************************");
        log.info("Starting Test: {} ", testName);
        log.info("Language: " + language);
    }

    @Description("Prints based on indent level (index). By default the index is 0")
    public static void logger(int indentLevel, String message) {
        if (indentLevel == 0) {
            log.info(message);
        } else {
            log.info(StringUtils.repeat("\t", indentLevel) + message);
        }
    }

    @Description("Prints based on indent level (index). By default the index is 0")
    public static void logger(String message, Object... args) {
        logByIndentLevel(0, message, args);
    }

    @Description("Prints based on indent level (index). By default the index is 0")
    public static void logByIndentLevel(int indentLevel, String message, Object... args) {
        if (indentLevel == 0) {
            log.info(message, args);
        } else {
            log.info(StringUtils.repeat("\t", indentLevel) + message, args);
        }
    }

    private static void logByIndentLevel(String message) {
        logger(0, message);
    }
}

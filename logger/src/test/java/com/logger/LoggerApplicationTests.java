package com.logger;

import com.logger.logging.LogHandler;
import org.junit.jupiter.api.Test;

class LoggerApplicationTests {

    @Test
    void testLogByIndentLevel() {
        LogHandler.logByIndentLevel(0,"test print 0");
        LogHandler.logByIndentLevel(1,"test print 1");
        LogHandler.logByIndentLevel(2,"test print 2");
        LogHandler.logByIndentLevel(3, "test print 3");
    }

    @Test
    void testLoggers() {
        LogHandler.logHeader("UI Automation begins");
        LogHandler.logTestStarts();
        LogHandler.logTestEnds();
        LogHandler.logLangHeader("french");
    }

}

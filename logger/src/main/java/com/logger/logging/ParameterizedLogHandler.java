package com.logger.logging;

import org.springframework.context.annotation.Description;

public class ParameterizedLogHandler {

    @Description("")
    public static void paramLogger(String handler, Pair... variablePair) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n").append(handler);

        for (Pair pair : variablePair) {
            String formattedStr = String.format("\n%-50s %s", pair.getKey() + ":", pair.getValue());
            stringBuilder.append(formattedStr);
        }

        LogHandler.logger(stringBuilder.toString());
    }
}

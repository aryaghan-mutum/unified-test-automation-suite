package com.logger.logging;

public class ParameterizedTestHandler {

    public static void print(String handler, Pair... variablePair) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n").append(handler);
        for (Pair pair : variablePair) {
            stringBuilder.append(String.format("\n%-50s %s", pair.getKey() + ":", pair.getValue()));
        }
        LogHandler.debugPrint(stringBuilder.toString());
    }
}

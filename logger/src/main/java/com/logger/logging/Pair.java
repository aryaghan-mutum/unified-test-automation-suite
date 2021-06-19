package com.logger.logging;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pair {

    private String key;
    private String value;

    public Pair(String key, int value) {
        this.key = key;
        this.value = String.valueOf(value);
    }

}

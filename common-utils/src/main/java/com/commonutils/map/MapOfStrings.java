package com.commonutils.map;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MapOfStrings extends LinkedHashMap<String, String> {

    public MapOfStrings(int initialCapacity) {
        super(initialCapacity);
    }

    public MapOfStrings(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public MapOfStrings(int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }

    public MapOfStrings(Map<? extends String, ?> mapOfObjects) {
        mapOfObjects.entrySet().stream().forEach(entry -> {
            put(entry.getKey(), entry.getValue());
        });
    }

    public void put(String key, Object value) {
        put(key, value == null ? null : value.toString());
    }

    public String getString(Object key) {
        return this.get(key);
    }

}

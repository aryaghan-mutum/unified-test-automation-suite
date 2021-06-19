package com.commonutils.map;

import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;
import java.util.Map;

@NoArgsConstructor
public class MapOfObjects extends LinkedHashMap<String, Object> {

    public MapOfObjects(int initialCapacity) {
        super(initialCapacity);
    }

    public MapOfObjects(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public MapOfObjects(int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }

    public MapOfObjects(Map<? extends String, ?> m) {
        super(m);
    }

    public String getString(Object key) {
        return (String) this.get(key);
    }

}

package com.commonutils.map;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapOfExcelRows extends LinkedHashMap<String, List<MapOfObjects>> {

    public MapOfExcelRows(Map<String, List<Map<String, Object>>> m) {
        m.entrySet().stream().forEach(entry -> {
            put(entry.getKey(), ListOfMapsUtil.convert(entry.getValue()));
        });
    }

}

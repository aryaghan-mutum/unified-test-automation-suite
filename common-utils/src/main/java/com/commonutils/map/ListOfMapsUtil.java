package com.commonutils.map;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ListOfMapsUtil {

    public static List<MapOfObjects> convert(List<Map<String, Object>> listOfMaps) {
        List<MapOfObjects> mapOfObjectsList = new ArrayList<>(listOfMaps.size());
        listOfMaps.stream().forEach(inputMap -> mapOfObjectsList.add(new MapOfObjects(inputMap)));
        return mapOfObjectsList;
    }

}

package com.commonutils;

import com.commonutils.map.MapOfObjects;
import com.commonutils.map.MapOfStrings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapTest {

    @Test
    public void testMapOfStrings() {
        MapOfStrings map = new MapOfStrings(3);
        map.put("1", "brazilian jiu-jitsu");
        map.put("2", "capoera");
        map.put("3", "karate");
        map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
        Assertions.assertEquals(map.size(), 3);

        Assertions.assertEquals(map.getString(0), null);
        Assertions.assertEquals(map.getString("1"), "brazilian jiu-jitsu");
        Assertions.assertEquals(map.getString("2"), "capoera");
    }

    @Test
    public void testMapOfObjects() {
        MapOfObjects map = new MapOfObjects(3);
        map.put("1", "brazilian jiu-jitsu");
        map.put("2", "capoera");
        map.put("3", "karate");
        map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
        Assertions.assertEquals(map.size(), 3);

        Assertions.assertEquals(map.getString(0), null);
        Assertions.assertEquals(map.getString("1"), "brazilian jiu-jitsu");
        Assertions.assertEquals(map.getString("2"), "capoera");
    }
}

package com.practice.java.interviewcoding.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyHashMapTest {
    MyHashMap<String, String> myHashMap = new MyHashMap<>();

    @Test
    void put() {
        myHashMap.put("Delhi", "Delhi");
        myHashMap.put("Karnataka", "Bengluru");
        myHashMap.put("Gujarat", "GandhiNagar");
        myHashMap.put("TamilNadu", "Chennai");
        assertEquals(4, myHashMap.getSize());
    }

    @Test
    void get() {
        myHashMap.put("Delhi", "Delhi");
        myHashMap.put("Karnataka", "Bengluru");
        myHashMap.put("Gujarat", "GandhiNagar");
        myHashMap.put("TamilNadu", "Chennai");
        assertEquals("Delhi", myHashMap.get("Delhi"));
        assertEquals("Bengluru", myHashMap.get("Karnataka"));
        assertEquals("GandhiNagar", myHashMap.get("Gujarat"));
        assertEquals("Chennai", myHashMap.get("TamilNadu"));
    }

    @Test
    void remove() {
        myHashMap.put("Delhi", "Delhi");
        myHashMap.put("Karnataka", "Bengluru");
        myHashMap.put("Gujarat", "GandhiNagar");
        myHashMap.put("TamilNadu", "Chennai");
        assertEquals(4, myHashMap.getSize());
        myHashMap.remove("Delhi");
        assertEquals(3, myHashMap.getSize());
        myHashMap.remove("TamilNadu");
        assertEquals(2, myHashMap.getSize());
    }
}
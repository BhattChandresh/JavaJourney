package com.practice.java.concurrentcollection;

import com.practice.java.Author;

import java.util.concurrent.ConcurrentHashMap;

@Author("")
public class ConCurrentHashMapMethods {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(101, "ABC");
        map.put(102, "AAA");
        map.put(103, "XYZ");
        map.put(104, "LMN");
        map.put(105, "FGH");
        System.out.println("1. " + map);
        map.put(102, "BBB");
        // if key is already present then do not put the key/value pair in map. In HashMap the for same key old value replaced with new value.
        //putIfAbsent
        map.putIfAbsent(101, "***");
        map.putIfAbsent(107, "ZZZ");
        System.out.println("2. " + map);
        //If key associated with given value then remove the entry from the map. In HashMap if key is present then it won't try to check the value of value and remove the entry.
        //remove(object key, object value)
        map.remove(102);
        System.out.println("3. " + map);
        map.remove(101, "555");
        System.out.println("4. " + map);
        //map.remove(110);  - - This line won't generate the error / Exception
        //If key and value both match the replace the old value with new value.
        //replace(object key,object oldvalue,object newvalue)
        map.replace(101, "BBB");
        System.out.println("5. " + map);
        map.replace(101, "444", "777");
        map.replace(101, "BBB", "PPP");
        System.out.println("6. " + map);

    }
}

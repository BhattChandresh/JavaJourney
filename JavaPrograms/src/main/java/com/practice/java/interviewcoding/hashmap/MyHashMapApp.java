package com.practice.java.interviewcoding.hashmap;

public class MyHashMapApp {
    public static void main(String[] args) {
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.put("Gujarat", "GandhiNagar");
        System.out.println(myHashMap.get("Gujarat"));
        myHashMap.put("Delhi", "Delhi");
        System.out.println(myHashMap.get("Delhi"));
        myHashMap.put("Gujarat", "Ahmadabad");
        System.out.println(myHashMap.get("Gujarat"));
        System.out.println(myHashMap.getSize());
        myHashMap.remove("Delhi");
        System.out.println(myHashMap.getSize());
    }
}

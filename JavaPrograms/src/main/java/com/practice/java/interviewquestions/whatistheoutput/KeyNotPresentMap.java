package com.practice.java.interviewquestions.whatistheoutput;

import java.util.HashMap;
import java.util.Map;

public class KeyNotPresentMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Delhi","Delhi");
        map.put("Maharashtra","Mumbai");
        map.put("Tamilnadu","Chennai");
        System.out.println("Output is = " + map.get("Gujarat"));
    }
}

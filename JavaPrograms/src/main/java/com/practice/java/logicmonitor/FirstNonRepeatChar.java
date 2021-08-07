package com.practice.java.logicmonitor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstNonRepeatChar {
    public static void main(String[] args) {
        String s = firstNonRepeatingLetter("aaa");
        System.out.println(s);
    }

    public static String firstNonRepeatingLetter(String str) {
        Set<String> repeating = new HashSet<>();
        List<String> nonRepeating = new ArrayList<>();
        String anotherStr = str;
        anotherStr = anotherStr.toLowerCase();
        for (int index = 0; index < anotherStr.length(); index++) {
            String s1 = String.valueOf(anotherStr.charAt(index));

            if (repeating.contains(s1)) {
                continue;
            }
            if (nonRepeating.contains(s1)) {
                nonRepeating.remove(s1);
                repeating.add(s1);
            } else {
                nonRepeating.add(s1);
            }
        }
        if (nonRepeating.isEmpty()) {
            return "";
        }
        int index = anotherStr.indexOf(nonRepeating.get(0));
        return String.valueOf(str.charAt(index));
    }
}

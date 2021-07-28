/*
  Problem Statement:
  How to Count Occurrences of a Character in String
 */
package com.practice.java.mypractice;

import java.util.HashMap;

public class MaxCharOccurrence {
    public static void main(String[] args) {
        String str = "ABABCABAACBDA";
        maxCharOccurance(str);
    }

    public static void maxCharOccurance(String str) {
        int value;
        HashMap<Character, Integer> m = new HashMap<>();
        char[] c = str.toCharArray();
        for (char item : c) {
            if (m.containsKey(item)) {
                value = m.get(item);
                m.put(item, value + 1);
            } else {
                m.put(item, 1);
            }
        }
        System.out.println(m);
    }
}

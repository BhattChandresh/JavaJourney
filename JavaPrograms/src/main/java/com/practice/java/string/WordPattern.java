/*
Given a pattern and a string s, find if s follows the same pattern.

Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false

 */
package com.practice.java.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordPattern {
    public static void main(String[] args) {
        WordPattern wordPattern = new WordPattern();
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();
        String input = sc.nextLine();
        sc.close();
        boolean isOk = wordPattern.validateWordPattern(pattern, input);
        System.out.println(isOk);
    }

    protected boolean validateWordPattern(String pattern, String input) {
        int patternLength = pattern.length();
        input = input.replaceAll("//s+", " ");
        String[] wordArr = input.split(" ");
        int wordArrLength = wordArr.length;

        if (patternLength != wordArrLength) {
            return false;
        }

        Map<String, String> patternToWordMap = new HashMap<>();

        for (int index = 0; index < patternLength; index++) {
            String patternChar = Character.toString(pattern.charAt(index));
            if (patternToWordMap.containsKey(patternChar)) {
                String value = patternToWordMap.get(patternChar);
                if (!(value.equals(wordArr[index]))) {
                    return false;
                }
            } else {
                patternToWordMap.put(patternChar, wordArr[index]);
            }
        }
        return true;
    }
}

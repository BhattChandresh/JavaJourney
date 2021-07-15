package com.practice.java.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonCharacters {
    Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        //String[] inputArr = {"ababab", "cdcdcd", "eeeee"};
        //String[] inputArr = {"geeksforgeeks", "platformforgeeks"};
        //String[] inputArr = {"abcd", "aad"};
        //String[] inputArr = {"cool","lock","cook"};
        String[] inputArr = {"bella", "label", "roller"};
        CommonCharacters commonCharacters = new CommonCharacters();
        List<String> commonChars = new ArrayList<>();
        Map<String, Integer> resultMap = new HashMap<>();
        List<String> entryToBeRemoved = new ArrayList<>();

        for (int index = 0; index < inputArr.length; index++) {
            Map<String, Integer> wordMap = commonCharacters.findCommonChars(inputArr[index]);
            System.out.println(wordMap);
            if (index == 0) {
                for (Map.Entry<String, Integer> entry1 : wordMap.entrySet()) {
                    resultMap.put(entry1.getKey(), entry1.getValue());
                }
            } else {
                for (Map.Entry<String, Integer> entry1 : wordMap.entrySet()) {
                    if (!(resultMap.containsKey(entry1.getKey()) && resultMap.containsValue(entry1.getValue()))) {
                        resultMap.remove(entry1.getKey(), entry1.getValue());
                    } else if (resultMap.containsKey(entry1.getKey()) && (resultMap.get(entry1.getKey()) != entry1.getValue())) {
                        int value = resultMap.get(entry1.getKey());
                        value = Math.abs(value - entry1.getValue());
                        resultMap.put(entry1.getKey(), value);
                    }
                }

                for (Map.Entry<String, Integer> entry1 : resultMap.entrySet()) {
                    if (!(wordMap.containsKey(entry1.getKey()) && wordMap.containsValue(entry1.getValue()))) {
                        entryToBeRemoved.add(entry1.getKey());
                    }
                }

                for (String s : entryToBeRemoved) {
                    resultMap.remove(s);
                }
            }
            wordMap.clear();
        }

        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            for (int index = 0; index < entry.getValue(); index++) {
                commonChars.add(entry.getKey());
            }
        }
        System.out.println(commonChars);
    }

    protected Map<String, Integer> findCommonChars(String word) {
        for (int index = 0; index < word.length(); index++) {
            String strKey = String.valueOf(word.charAt(index));
            if (map.containsKey(strKey)) {
                int value = map.get(strKey);
                map.put(strKey, value + 1);
            } else {
                map.put(strKey, 1);
            }
        }
        return map;
    }
}
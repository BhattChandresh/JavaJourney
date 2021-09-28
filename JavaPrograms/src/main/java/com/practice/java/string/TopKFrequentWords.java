/*
Given an array of strings words and an integer k, return the k most frequent strings.
Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.
Example:
    Input: words = ["i","love","leetcode","i","love","coding"], k = 2
    Output: ["i","love"]
    Explanation: "i" and "love" are the two most frequent words.
    Note that "i" comes before "love" due to a lower alphabetical order.
 */

package com.practice.java.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TopKFrequentWords {
    static int previousValue = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int topKWords = sc.nextInt();
        sc.close();
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        TopKFrequentWords topKFrequentWords = new TopKFrequentWords();
        List<String> top_words = topKFrequentWords.topKFrequent(words, topKWords);
        System.out.println(top_words);
    }

    protected List<String> topKFrequent(String[] words, int topKWords) {
        Map<String, Integer> countingMap = new HashMap<>();
        List<String> topKFrequentWordList = new ArrayList<>();

        IntStream.range(0, words.length).forEach((index) -> {
            if (countingMap.containsKey(words[index])) {
                countingMap.put(words[index], countingMap.get(words[index]) + 1);
            } else {
                countingMap.put(words[index], 1);
            }
        });

        LinkedHashMap<String, Integer> sortedMapByValue = countingMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(topKWords)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (value1, value2) -> value2, LinkedHashMap::new));


        sortedMapByValue.forEach((k, v) -> {
            if (topKFrequentWordList.isEmpty()) {
                topKFrequentWordList.add(k);
            } else {
                if (previousValue == sortedMapByValue.get(k)) {
                    topKFrequentWordList.add(k);
                    Collections.sort(topKFrequentWordList);
                } else {
                    topKFrequentWordList.add(k);
                }
            }
            previousValue = sortedMapByValue.get(k);
        });


        return topKFrequentWordList;
    }
}

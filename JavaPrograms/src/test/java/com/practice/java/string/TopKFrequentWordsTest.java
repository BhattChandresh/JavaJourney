package com.practice.java.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TopKFrequentWordsTest {
    private TopKFrequentWords topKFrequentWords;

    @BeforeEach
    public void init() {
        topKFrequentWords = new TopKFrequentWords();
    }

    @Test
    void testTopKFrequent() {
        List<String> expectedList = new ArrayList<>();
        expectedList.add("the");
        expectedList.add("is");
        expectedList.add("sunny");
        expectedList.add("day");
        assertEquals(expectedList, topKFrequentWords.topKFrequent(
                new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4));

        expectedList.clear();
        expectedList.add("i");
        expectedList.add("love");
        assertEquals(expectedList, topKFrequentWords.topKFrequent(
                new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2));

        expectedList.clear();
        expectedList.add("geeks");
        expectedList.add("be");
        expectedList.add("a");
        assertEquals(expectedList, topKFrequentWords.topKFrequent(
                new String[]{"geeks", "for", "geeks", "a", "portal", "to", "learn", "can", "be", "computer",
                        "science", "zoom", "yup", "fire", "in", "be", "data", "geeks"}, 3));
    }
}
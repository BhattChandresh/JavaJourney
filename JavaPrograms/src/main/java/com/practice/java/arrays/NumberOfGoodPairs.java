/*
Given an array of integers nums.
A pair (i,j) is called good if nums[i] == nums[j] and i < j.
Return the number of good pairs.

Example:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */
package com.practice.java.arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] inputArr = {1, 2, 3, 1, 1, 3};
        NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();
        int goodPairsBruteForce = numberOfGoodPairs.findGoodPairsBruteForce(inputArr);
        System.out.println("No. of Good Pairs = " + goodPairsBruteForce);
        int goodPairsLinearTime = numberOfGoodPairs.findGoodPairsLinearTime(inputArr);
        System.out.println("No. of Good Pairs = " + goodPairsLinearTime);
    }

    //Time Complexity : O(n)
    protected int findGoodPairsLinearTime(int[] inputArr) {
        int goodPairs = 0;
        int validPair;
        Map<Integer, Integer> pairMap = new HashMap<>();
        for (int i : inputArr) {
            if (pairMap.containsKey(i)) {
                validPair = pairMap.get(i);
                goodPairs += validPair;
                pairMap.put(i, validPair + 1);
            } else {
                pairMap.put(i, 1);
            }
        }
        return goodPairs;
    }

    //Time Complexity : O(n^2)
    protected int findGoodPairsBruteForce(int[] inputArr) {
        int goodPairs = 0;
        StringBuilder pairs = new StringBuilder();
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[i] == inputArr[j] && i < j) {
                    goodPairs += 1;
                    pairs.append("(").append(i).append(" , ").append(j).append(")").append(" ");
                }
            }
        }
        System.out.println(pairs);
        return goodPairs;
    }
}

/*
Given an integer array nums of length n where all the integers of nums are in the range [1, n]
 and each integer appears once or twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant extra space.
Example:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

Example:
Input: nums = [1,1,2]
Output: [1]
 */
package com.practice.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int[] inputArr = {4, 3, 2, 7, 8, 2, 3, 1};
        FindAllDuplicatesInArray findAllDuplicatesInArray = new FindAllDuplicatesInArray();
        List<Integer> result1 = findAllDuplicatesInArray.getAllDuplicateElementsTraditionalApproach(inputArr);
        System.out.println(result1);
        List<Integer> result2 = findAllDuplicatesInArray.getAllDuplicateElementsFunctionalApproach(inputArr);
        System.out.println(result2);
    }

    protected List<Integer> getAllDuplicateElementsTraditionalApproach(int[] inputArr) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i : inputArr) {
            if (!(set.add(i)))
                list.add(i);
        }
        return list;
    }

    protected List<Integer> getAllDuplicateElementsFunctionalApproach(int[] inputArr) {
        Set<Integer> set = new HashSet<>();
        return Arrays.stream(inputArr)
                .filter((index) -> !(set.add(index)))
                .boxed()
                .collect(Collectors.toList());
    }
}

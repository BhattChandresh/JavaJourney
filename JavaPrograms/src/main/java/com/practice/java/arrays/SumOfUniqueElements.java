/*
You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
Return the sum of all the unique elements of nums.

Input: nums = [1,2,3,2]
Output: 4 (Unique elements are 1 and 3)

Input: nums = [1,1,1,1,1]
Output: 0 (No unique elements)

1 <= nums.length <= 100
1 <= nums[i] <= 100
 */
package com.practice.java.arrays;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] inputArr = {};
        SumOfUniqueElements sumOfUniqueElements = new SumOfUniqueElements();
        sumOfUniqueElements.getSumOfUniqueElementsByMap(inputArr);
    }

    int getSumOfUniqueElementsByMap(int[] inputArr) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i : inputArr) {
            if (!(map.containsKey(i))) {
                map.put(i, 1);
            } else {
                int value = map.get(i);
                map.put(i, value + 1);
            }
        }

        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            if (set.getValue() == 1) {
                sum += set.getKey();
            }
        }
        System.out.println(sum);
        return sum;
    }
}

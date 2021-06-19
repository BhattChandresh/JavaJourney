/*
  Author : Chandresh Bhatt
  Given an array of integers, return indices of the two numbers such that they add up to a specific target.
  <p>
  input = [1,3,7,9,2]
  target = 11
  output = [3,4]
  <p>
  Constraints:
  [1] Are there only of positive number or negative number or both? Only Positive Numbers
  [2]  Are there any duplicates in the array? No duplicates
  [3] Will there always be a solution ? May be not
  [4] Do we have multiple pairs as answer ? Nop, only one pair
  [5] If there are no indices, what should be the return value ? NULL
  <p>
  Test Cases:
  (1) [1,3,7,9,2]  target =  11 [3,4]
  (2) [1,3,7,9,2] target = 25  null
  (3) []  target = 1 null
  (4) [5]  target = 5  null
  (5)  [1,6]  target = 7  [0,1]
 */

package com.practice.java.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumEqualTarget {
    public static void main(String... args) {
        TwoSumEqualTarget twoSumEqualTarget = new TwoSumEqualTarget();
        twoSumEqualTarget.findIndexEqualToSumBruteForce1(new int[]{}, 0);
        twoSumEqualTarget.findIndexEqualToSumBruteForce2(new int[]{}, 0);
        twoSumEqualTarget.findIndexEqualToSum(new int[]{}, 0);
    }

    //Brute-Force Method-1
    int[] findIndexEqualToSumBruteForce1(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int index1 = 0; index1 < arr.length; index1++) {
            for (int index2 = index1 + 1; index2 < arr.length; index2++) {
                if (arr[index1] + arr[index2] == target) {
                    list.add(index1);
                    list.add(index2);
                }
            }
        }
        int[] result = new int[list.size()];
        for (Integer i : list) {
            result[count] = i;
            count++;
        }
        return result;
    }

    //Brute-Force Method-2
    int[] findIndexEqualToSumBruteForce2(int[] arr, int target) {
        int numberToFind;
        for (int index = 0; index < arr.length - 1; index++) {
            numberToFind = target - arr[index];
            for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
                if (numberToFind == arr[innerIndex]) {
                    return new int[]{index, innerIndex};
                }
            }
        }
        return null;
    }

    //Optimized Method where Time Complexity is O(n)
    int[] findIndexEqualToSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int numberToFInd;
        for (int index = 0; index < arr.length; index++) {
            numberToFInd = target - arr[index];
            if (map.containsKey(numberToFInd)) {
                return new int[]{map.get(numberToFInd), index};
            } else {
                map.put(arr[index], index);
            }
        }
        return null;
    }
}

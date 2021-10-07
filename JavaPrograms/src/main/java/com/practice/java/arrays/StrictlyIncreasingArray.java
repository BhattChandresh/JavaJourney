/*
Given a 0-indexed integer array nums, return true if it can be made strictly increasing after removing exactly one element, or false otherwise.
 If the array is already strictly increasing, return true.
The array nums is strictly increasing if nums[i - 1] < nums[i] for each index (1 <= i < nums.length).

Example :
Input: nums = [1,2,10,5,7]
Output: true
Explanation: By removing 10 at index 2 from nums, it becomes [1,2,5,7].
[1,2,5,7] is strictly increasing, so return true.
 */
package com.practice.java.arrays;

import java.util.ArrayList;
import java.util.List;

public class StrictlyIncreasingArray {
    public static void main(String[] args) {
        StrictlyIncreasingArray increasingArray = new StrictlyIncreasingArray();
        int[] inputArr = {1, 1, 1};
        boolean isIncreasingArr = increasingArray.IsStrictlyIncreasingArr(inputArr);
        if (isIncreasingArr) {
            System.out.println("Given Array is strictly Increasing");
        } else {
            System.out.println("Given Array is not strictly increasing");
        }
    }

    protected boolean IsStrictlyIncreasingArr(int[] inputArr) {
        int arrLength = inputArr.length;

        for (int index = 0; index < arrLength - 1; index++) {
            if (!(inputArr[index] < inputArr[index + 1])) {
                return possiblePairs(inputArr, index, index + 1);
            }
        }
        return true;
    }

    private boolean possiblePairs(int[] inputArr, int index1, int index2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        boolean isIncreasing1 = true;
        boolean isIncreasing2 = true;

        for (int index = 0; index < inputArr.length; index++) {
            if (index != index1) {
                list1.add(inputArr[index]);
            }
            if (index != index2) {
                list2.add(inputArr[index]);
            }
        }

        for (int index = 0; index < list1.size() - 1; index++) {
            if (list1.get(index) >= list1.get(index + 1)) {
                isIncreasing1 = false;
                break;
            }
        }

        for (int index = 0; index < list1.size() - 1; index++) {
            if (list2.get(index) >= list2.get(index + 1)) {
                isIncreasing2 = false;
                break;
            }
        }
        return isIncreasing1 || isIncreasing2;
    }
}

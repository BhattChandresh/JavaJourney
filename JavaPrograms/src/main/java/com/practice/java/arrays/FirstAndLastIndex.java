/*
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
nums = [5,7,7,8,8,10], target = 8 -> [3,4]
nums = [5,7,7,8,8,10], target = 6 -> [-1,-1]

 */
package com.practice.java.arrays;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        FirstAndLastIndex index = new FirstAndLastIndex();
        int[] inputArr = {};
        int target = 8;
        int[] position1 = index.findFirstAndLastElementPositionLinearSearch(inputArr, target);
        int[] position2 = index.findFirstAndLastElementPositionBinarySearch(inputArr, target);
    }

    protected int[] findFirstAndLastElementPositionBinarySearch(int[] inputArr, int target) {
        int[] position = new int[2];
        int start = 0;
        int end = inputArr.length - 1;
        int targetIndex = 0;

        if (inputArr.length == 0) {
            position[0] = -1;
            position[1] = -1;
            return position;
        }

        while (start < end) {
            int mid = (start + end) / 2;
            if (inputArr[mid] == target) {
                targetIndex = mid;
                break;
            }
            if (inputArr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if(targetIndex == 0) {
            position[0] = -1;
            position[1] = -1;
        }

        for (int index = targetIndex; index >= 0; index--) {
            if (inputArr[index] != target) {
                position[0] = index + 1;
                break;
            }
        }

        for (int index = targetIndex; index < inputArr.length; index++) {
            if (inputArr[index] != target) {
                position[1] = index - 1;
                break;
            }
        }
        return position;
    }

    protected int[] findFirstAndLastElementPositionLinearSearch(int[] inputArr, int target) {
        int[] position = new int[2];
        List<Integer> list = new ArrayList<>();

        if (inputArr.length == 0) {
            position[0] = -1;
            position[1] = -1;
            return position;
        }

        for (int index = 0; index < inputArr.length; index++) {
            if (target == inputArr[index]) {
                list.add(index);
            }
        }

        if (list.isEmpty()) {
            position[0] = -1;
            position[1] = -1;
            return position;
        }
        position[0] = list.get(0);
        position[1] = list.get(list.size() - 1);
        return position;
    }
}

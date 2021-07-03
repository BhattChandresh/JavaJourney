/*
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
nums = [5,7,7,8,8,10], target = 8 -> [3,4]
nums = [5,7,7,8,8,10], target = 6 -> [-1,-1]

 */
package com.practice.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        FirstAndLastIndex index = new FirstAndLastIndex();
        //int[] inputArr = {5,7,7,8,8,8,8,8,8,8,8,8,8,10,11,12,13,15};
        int[] inputArr = {};
        int target = 7;
        int[] position = index.findFirstAndLastElementPositionLinearSearch(inputArr, target);
        System.out.println(Arrays.toString(position));
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

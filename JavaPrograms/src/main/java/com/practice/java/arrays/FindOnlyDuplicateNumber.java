/*
Given an array of integers nums containing n+1 integers where each integer is in the range [1,n] inclusive.
There is only one repeated number in nums, return this repeated number.
Input : nums[1,3,4,2,2] Output : 2
Input : nums[1,1] Output : 1
Input : nums[1,1,2] Output : 1
 */
package com.practice.java.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindOnlyDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {};
        FindOnlyDuplicateNumber duplicateNumber = new FindOnlyDuplicateNumber();
        duplicateNumber.findOnlyDuplicateNumberBySet(nums);
        duplicateNumber.findOnlyDuplicateNumber(nums);
    }

    int findOnlyDuplicateNumberBySet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean isPresent;
        for (Integer num : nums) {
            isPresent = set.contains(num);
            if (isPresent) {
                return num;
            } else {
                set.add(num);
            }
        }
        return -1;
    }

    int findOnlyDuplicateNumber(int[] nums) {
        int size = nums.length;
        int[] count = new int[size + 1];

        for (int num : nums) {
            count[num] += 1;
            if (count[num] > 1) {
                return num;
            }
        }
        return -1;
    }
}

/*
Problem : 238
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

Constraints:
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */

package com.practice.java.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    int[] output;

    public static void main(String[] args) {
        int[] inputArr = {1, 2, 3, 4};
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] result1 = productOfArrayExceptSelf.getProductOfArrExceptSelfNotLinearTime(inputArr);
        System.out.println(Arrays.toString(result1));
        int[] result2 = productOfArrayExceptSelf.getProductOfArrExceptSelfUsingRecursion(inputArr, 0);
        System.out.println(Arrays.toString(result2));
    }

    protected int[] getProductOfArrExceptSelfUsingRecursion(int[] inputArr, int index) {
        if (index < inputArr.length) {
            if (index == 0) {
                output = new int[inputArr.length];
            }
            int result = 1;
            for (int index1 = 0; index1 < inputArr.length; index1++) {
                if (index1 == index) {
                    continue;
                }
                result = result * inputArr[index1];
            }
            output[index] = result;
            getProductOfArrExceptSelfUsingRecursion(inputArr, index + 1);
        }
        return output;
    }

    protected int[] getProductOfArrExceptSelfNotLinearTime(int[] inputArr) {
        int arrLength = inputArr.length;
        int[] output = new int[arrLength];

        for (int index = 0; index < arrLength; index++) {
            output[index] = getProductOfElement(inputArr, index);
        }
        return output;
    }

    private int getProductOfElement(int[] inputArr, int index) {
        int result = 1;
        for (int index1 = 0; index1 < inputArr.length; index1++) {
            if (index1 == index) {
                continue;
            }
            result = result * inputArr[index1];
        }
        return result;
    }
}

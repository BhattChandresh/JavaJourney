/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

We need to use the  Kadane's Algorithm which is given below.

Initialize:
    max_so_far = INT_MIN
    max_ending_here = 0

Loop for each element of the array
  (a) max_ending_here = max_ending_here + a[i]
  (b) if(max_so_far < max_ending_here)
            max_so_far = max_ending_here
  (c) if(max_ending_here < 0)
            max_ending_here = 0
return max_so_far

 */
package com.practice.java.arrays;

public class LargestSumFromSubArray {
    public static void main(String[] args) {
        LargestSumFromSubArray maxSubArr = new LargestSumFromSubArray();
        int[] inputArr = {5, 4, -1, 7, 8};
        int largestSum = maxSubArr.getLargestSumFromSubArrayInLinearTime(inputArr);
        System.out.println("Largest Sum = " + largestSum);
    }

    protected int getLargestSumFromSubArrayInLinearTime(int[] inputArr) {
        int max_so_for = 0;
        int max_ending_here = 0;
        for (int i : inputArr) {
            max_ending_here += i;
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_ending_here > max_so_for) {
                max_so_for = max_ending_here;
            }
        }
        return max_so_for;
    }
}

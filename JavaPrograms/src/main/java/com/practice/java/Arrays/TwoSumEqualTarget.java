/**
 *  Author : Chandresh Bhatt
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *                                                                              OR
 *  Java program to find the sum of the two elements of a given array which is equal to a given integer.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
package com.practice.java.Arrays;

public class TwoSumEqualTarget {
    public static void main(String... args) {
//        int[] arr1 = {1,2,4,5,6};
//        int target = 6;

        int[] arr1 = { 2, 7, 11, 15};
        int target = 9;
        findIndexEqualToSum(arr1, target);
    }

    static void findIndexEqualToSum(int[] arr, int target) {
        for(int index1 =0; index1 < arr.length;index1++) {
            for(int index2 = index1 + 1; index2 < arr.length;index2++) {
                if(arr[index1] + arr[index2] == target)  {
                    System.out.println("Indexes who's sum is equal to target is : "+arr[index1] + "+"  + arr[index2] + "=" + target);
                    System.out.println("Indexs are [ " + index1 + "," + index2 + "]");
                }
            }
        }
    }
}

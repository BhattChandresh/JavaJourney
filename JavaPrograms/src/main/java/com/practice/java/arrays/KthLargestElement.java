/*
Given an array and a number k where k is smaller than the size of the array,
 we need to find the k’th smallest element in the given array. It is given that all array elements are distinct.
 Examples:

Input: arr[] = {7, 10, 4, 3, 20, 15}
       k = 3
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15}
       k = 4
Output: 10
 */
package com.practice.java.arrays;

import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {
        KthLargestElement kthLargestElement = new KthLargestElement();
        int[] arr = {7, 10, 4, 3, 20, 15};
        int desiredElement = kthLargestElement.getKthLargestElementBySoring(arr, 6);
        System.out.println("Kth Largest element is = " + desiredElement);
    }

    int getKthLargestElementBySoring(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}

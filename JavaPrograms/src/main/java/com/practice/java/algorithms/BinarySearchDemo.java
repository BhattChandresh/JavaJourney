/**
 *
 *   Worst Complexity : O (log n)
 *   Avg. Complexity : O (log n)
 *   Best Complexity : O (1)
 *   Space Complexity : O (1)
 */

package com.practice.java.algorithms;

import com.practice.java.Author;

@Author("Chandresh Bhatt")
public class BinarySearchDemo {
    public static void main(String[] args) {
        /**
         * In order for Binary Search to work, precondition is elements should be sorted.
         * Here assumption is arrays are already sorted.
         */
        int[] arr = {3, 11, 21, 29, 41, 54, 61, 78, 110, 127};
        int value = 110;
        int result = binarySearch(arr, value);
        System.out.println("Index of the element is :" + result);
    }

    static int binarySearch(int[] arr, int value) {
        // 1. Find the range / length of the array.
        int head = 0;
        int tail = arr.length - 1;
        System.out.println("Arr Length = " + tail);
        int mid = 0;

        // 2. Iterate over the array.
        while (head <= tail) {
            // 2.a find the middle element of the array and check
            // value to be search is in which half.
            mid = (head + tail) / 2;
            System.out.println("Mid = " + mid);
            //2.b check that mid index is matching index then return the value
            if (arr[mid] == value)
                return mid;
            //2.c if value to be search is > arr[mid]  then adjust the head = mid +1
            //2.c if value to be search is < arr[mid] then adjust the tail = mid -1
            if (arr[mid] < value) {
                head = mid + 1;
                System.out.println("Head = " + head);
            }

            if (arr[mid] > value) {
                tail = mid - 1;
                System.out.println("Tail = " + tail);
            }
        }
        return -1;
    }
}


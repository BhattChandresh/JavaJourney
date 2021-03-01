/**
 * Remove the Duplicate element from an Array.
 */
package com.practice.java.Arrays;

import com.practice.java.Author;

import java.util.LinkedHashSet;
import java.util.Set;

@Author("Chandresh Bhatt")
public class RemoveDuplicateFromArr {
    public static void main(String[] args) {
        int[] arr1 = {4, 3, 2, 4, 9, 2};
        int[] arr2 = {1, 2, 1, 2, 1, 2};
        int[] arr3 = {15, 21, 11, 21, 51, 21, 11};
        int[] arr4 = {7, 3, 21, 7, 34, 18, 3, 21};
        removeDuplicatesFromArray(arr1);
        removeDuplicatesFromArray(arr2);
        removeDuplicatesFromArray(arr3);
        removeDuplicatesFromArray(arr4);
    }

    static void removeDuplicatesFromArray(int[] arr) {
        // Here LinkedHashSet is being used because it maintains the insertion order.
        Set<Integer> s1 = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s1.add(arr[i]);
        }
        System.out.println(s1);
    }
}

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
        RemoveDuplicateFromArr removeDuplicateFromArr = new RemoveDuplicateFromArr();
        removeDuplicateFromArr.removeDuplicateElements(new int[]{});
    }

    Set<Integer> removeDuplicateElements(int[] arr) {
        // Here LinkedHashSet is being used because it maintains the insertion order.
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set;
    }
}

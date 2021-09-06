/*
  Remove the Duplicate element from an Array.
 */
package com.practice.java.arrays;

import com.practice.java.Author;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

@Author()
public class RemoveDuplicateFromArr {
    public static void main(String[] args) {
        RemoveDuplicateFromArr removeDuplicateFromArr = new RemoveDuplicateFromArr();
        removeDuplicateFromArr.removeDuplicateElements(new int[]{});
    }

    Set<Integer> removeDuplicateElements(int[] arr) {
        // Here LinkedHashSet is being used because it maintains the insertion order.
        Set<Integer> set = new LinkedHashSet<>();
        IntStream.range(0, arr.length)
                .forEach(index -> set.add(arr[index]));
        return set;
    }
}

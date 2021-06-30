/*
 * Two arrays are given.
 * Data from both the arrays have to be taken and put into the third array and this third array should have only unique elements.
 * Implement this without using set.
 */
package com.practice.java.arrays;

import com.practice.java.Author;

import java.util.ArrayList;
import java.util.List;

@Author()
public class MergeTwoArrsAndRemoveDuplicates {
    public static void main(String[] args) {
        MergeTwoArrsAndRemoveDuplicates mergeTwoArrsAndRemoveDuplicates =
                new MergeTwoArrsAndRemoveDuplicates();
        mergeTwoArrsAndRemoveDuplicates.mergeArrAndRemoveDuplicate(new int[]{}, new int[]{});
    }

    int[] mergeArrAndRemoveDuplicate(int[] source1, int[] source2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < source1.length; i++) {
            if (i == 0)
                list.add(source1[i]);
            else {
                if (!(list.contains(source1[i]))) {
                    list.add(source1[i]);
                }
            }
        }

        for (int value : source2) {
            if (!(list.contains(value))) {
                list.add(value);
            }
        }

        int[] destination = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            destination[i] = list.get(i);
        }

        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1)
                System.out.print(destination[i]);
            else
                System.out.print(destination[i] + ",");
        }
        System.out.print("}");
        return destination;
    }
}

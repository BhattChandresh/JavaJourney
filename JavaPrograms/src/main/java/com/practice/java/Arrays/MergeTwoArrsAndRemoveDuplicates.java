/**
 * Two arrays are given.
 * Data from both the arrays have to be taken and put into the third array and this third array should have only unique elements.
 * Implement this without using set.
 */
package com.practice.java.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoArrsAndRemoveDuplicates {
    public static void main(String[] args) {
        int[] source1 = {1, 4, 5, 9, 10, 3};
        int[] source2 = {2, 3, 5, 6, 7, 10, 11, 6, 9};
        mergeArrAndRemoveDuplicate(source1,source2);
    }

    static void mergeArrAndRemoveDuplicate(int[] source1, int[] source2) {
        List<Integer> list = new ArrayList<Integer>();
        int[] destination = new int[source1.length + source2.length];
        for(int i=0; i < source1.length;i++) {
            if(i ==0 )
                list.add(source1[i]);
            else {
                if(!(list.contains(source1[i]))) {
                    list.add(source1[i]);
                }
            }
        }

        for(int i=0; i < source2.length;i++) {
            if(!(list.contains(source2[i]))) {
                list.add(source2[i]);
            }
        }

        for(int i=0; i < list.size();i++) {
            destination[i] = list.get(i);
        }

        System.out.print("{");
       for(int i=0; i < list.size();i++) {
           if(i == list.size() -1)
                 System.out.print(destination[i]);
           else
                System.out.print(destination[i] + ",");
       }
        System.out.print("}");
    }
}

/*
Given an array with integers, separate them into even and odd without using additional array.
 There is no need to maintain the order from the original array.
Example:
Input:
1 , 3 , 4, , 19, 73, 94, 59, 72, 95, 12
Output
3, 1, 19, 73,  59, 95, 4, 94, 12, 72
*/

package com.practice.java.arrays;

import java.util.Arrays;

public class EvenOddPartition {
    public static void main(String[] args) {
        int[] inputArr = {1, 3, 4, 19, 73, 94, 59, 72, 95, 12};
        EvenOddPartition evenOddPartition = new EvenOddPartition();
        long startTIme = System.currentTimeMillis();
        int[] result = evenOddPartition.partitionEvenAndOdd(inputArr);
        System.out.println("Execution Time = " + (System.currentTimeMillis() - startTIme));
        System.out.println(Arrays.toString(result));
    }

    protected int[] partitionEvenAndOdd(int[] inputArr) {
        int start = 0;
        int end = inputArr.length - 1;
        int oddSwap = 0;
        int evenSwap = 0;

        while (start < end) {
            if (inputArr[start] % 2 != 0) {
                start++;
            } else {
                evenSwap = inputArr[start];
            }

            if (inputArr[end] % 2 == 0) {
                end--;
            } else {
                oddSwap = inputArr[end];
            }

            if (oddSwap > 0 && evenSwap > 0) {
                inputArr[start] = oddSwap;
                inputArr[end] = evenSwap;
                oddSwap = 0;
                evenSwap = 0;
            }
        }
        return inputArr;
    }
}
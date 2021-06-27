package com.practice.java.algorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] inputArr = {10, 7, 1, 3, 5, 8, 9, 6};
        quickSort(inputArr, 0, inputArr.length - 1);
        System.out.println(Arrays.toString(inputArr));
    }

    static int[] quickSort(int[] inputArr, int start, int end) {
        if (start < end) {
            int partitionPoint = partition(inputArr, start, end); //gives the index position of the correctly placed value in the array.
            quickSort(inputArr, start, partitionPoint - 1); //sorts the left half of the range
            quickSort(inputArr, partitionPoint + 1, end); //sorts the right half of the range
        }
        return inputArr;
    }

    private static int partition(int[] inputArr, int start, int end) {
        int pivot = inputArr[end];
        //In the first iteration, it starts from 0
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (inputArr[j] <= pivot) {
                i = i + 1;
                swap(inputArr, i, j);
            }
        }
        int iVal = inputArr[i + 1];
        inputArr[end] = iVal;
        inputArr[i + 1] = pivot;
        return i + 1;
    }

    private static void swap(int[] inputArr, int i, int j) {
        int temp = inputArr[j];
        inputArr[j] = inputArr[i];
        inputArr[i] = temp;
    }
}

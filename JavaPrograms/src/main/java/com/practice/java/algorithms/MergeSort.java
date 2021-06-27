package com.practice.java.algorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] inputArray = {9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0};
        MergeSort sort = new MergeSort();
        sort.mergerSort(inputArray, 0, inputArray.length - 1);
    }

    void mergerSort(int[] inputArray, int start, int end) {
        if (end <= start) {
            return;
        }

        int mid = (start + end) / 2;
        mergerSort(inputArray, start, mid);
        mergerSort(inputArray, mid + 1, end);
        merge(inputArray, start, mid, end);
        System.out.println("Output = " + Arrays.toString(inputArray));
    }

    private void merge(int[] inputArray, int start, int mid, int end) {
        int[] tempArray = new int[(end - start) + 1];
        // index counter for the left side of the array
        int leftSlot = start;
        // index counter for the right side of the array
        int rightSlot = mid + 1;
        int k = 0;
        while (leftSlot <= mid && rightSlot <= end) {
            if (inputArray[leftSlot] < inputArray[rightSlot]) {
                tempArray[k] = inputArray[leftSlot];
                leftSlot = leftSlot + 1;
            } else {
                tempArray[k] = inputArray[rightSlot];
                rightSlot = rightSlot + 1;
            }
            k = k + 1;
        }
        //When execution reach here, both right and left side of the sub-array can be considered sorted.
        if (leftSlot <= mid) { //consider right side done being sorted. left must be sorted already.
            while (leftSlot <= mid) {
                tempArray[k] = inputArray[leftSlot];
                leftSlot += 1;
                k += 1;
            }
        } else if (rightSlot <= end) {
            while (rightSlot <= end) {
                tempArray[k] = inputArray[rightSlot];
                rightSlot += 1;
                k += 1;
            }
        }

        for(int i=0; i < tempArray.length;i++) {
            inputArray[start + i] = tempArray[i];
        }
    }
}

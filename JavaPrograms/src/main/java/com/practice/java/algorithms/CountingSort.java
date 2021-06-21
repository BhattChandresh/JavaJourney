package com.practice.java.algorithms;

public class CountingSort {
    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();
        int[] input = {2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9};
        countingSort.sortArray(input);
    }

    void sortArray(int[] input) {
        int length = input.length;
        int k = 9;
        int[] count = new int[k+1];
        int[] output = new int[length];

        for (int i : input) {
            count[i] += 1;
        }

        for(int index=1;index<count.length;index++) {
            count[index] = count[index] + count[index-1];
        }

        for(int index = length-1; index >=0;index--) {
             int element = input[index];
             int position = count[element];
             position = position -1;
             output[position] = element;
            count[element] = position;
        }

        System.out.println("Sorted output is = ");
        for (int value : output) {
            System.out.print(value + " ,");
        }
    }
}

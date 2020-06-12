package com.practice.java.mypractice;

public class recursiveLinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 33, 44, 56, 78, 99, 23};
        int index = recursiveLinearSearch(arr, 0, 33);
        System.out.println("Element is present at = " + index);
    }

    static int recursiveLinearSearch(int[] arr, int index, int element) {
        if (index > arr.length - 1)
            return -1;
        else if (element == arr[index])
            return index;
        else
            return recursiveLinearSearch(arr, index + 1, element);
    }
}

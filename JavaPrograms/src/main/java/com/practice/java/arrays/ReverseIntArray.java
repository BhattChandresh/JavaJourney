package com.practice.java.arrays;

import com.practice.java.Author;

@Author("")
public class ReverseIntArray {
    public static void main(String[] args) {
        ReverseIntArray reverseIntArray = new ReverseIntArray();
        reverseIntArray.reverseArray(new int[]{4, 5, 8, 9, 10});
        reverseIntArray.reverseArray(new int[]{891, 569, 921, 187, 343, 476, 555});
    }

    protected int[] reverseArray(int[] arr) {
        int index = 0;
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i > -1; i--) {
            result[index] = arr[i];
            index = index + 1;
        }
        return result;
    }
}

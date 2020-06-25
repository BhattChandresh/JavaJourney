package com.practice.java.Arrays;

import com.practice.java.Author;

@Author("Chandresh Bhatt")
public class ReverseIntArray {
    public static void main(String[] args) {
        reverseArray(new int[]{4, 5, 8, 9, 10});
        reverseArray(new int[]{12, 9, 21, 17, 33, 7});
        reverseArray(new int[]{891, 569, 921, 187, 343, 476, 555});
    }

    static void reverseArray(int[] arr) {
        int index = 0;
        int[] result = new int[arr.length];
        for(int i = arr.length-1; i > -1;i--) {
            result[index] = arr[i];
            index = index+1;
        }
        for(int i=0;i < result.length;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        for(int i=0;i < result.length;i++)
             System.out.print(result[i] +" ");
        System.out.println();
        System.out.println("--------------------------------------------");
    }
}

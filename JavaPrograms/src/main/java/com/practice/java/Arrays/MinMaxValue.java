/**
 *  Author : Bhatt Chandresh
 * Java Array Exercises:
 *      Find the maximum and minimum value from an array
 *    This coding question was asked at UnravelData.
 */
package com.practice.java.Arrays;

import com.practice.java.Author;
import java.util.Arrays;

@Author("Chandresh Bhatt")
public class MinMaxValue {
    public static void main(String... args) {
        int[][] arr1 = {
                {25,14,56,15,36,56,77,18,29,49},
                {3, 11, 21, 29, 41, 54, 61, 78, 110, 127},
                {-2,3,-9,1235,0,6,2,-12,-99,33,8888}
        };
        for(int i=0;i < arr1.length;i++) {
            findMinMaxValueFromArray(arr1[i]);
        }
    }

    static void findMinMaxValueFromArray(int[] arr) {
        // Method-1
        int min = arr[0];
        int max = arr[0];
        for(int index =0; index < arr.length-1;index++) {
            if(max < arr[index+1])
                max = arr[index+1];
            if(min > arr[index+1])
                min = arr[index + 1];
        }
        System.out.println("Method-1 - > Min Value = " + min);
        System.out.println("Method-1 -> Max Value = " + max);
        System.out.println("----------------------------------------------------------------------------------------------");

        //Method-2
        Arrays.sort(arr);
        System.out.println("Method-2 - > Min Value = " + arr[0]);
        System.out.println("Method-2 -> Max Value = " + arr[arr.length-1]);
        System.out.println("********************************************************");
    }
}

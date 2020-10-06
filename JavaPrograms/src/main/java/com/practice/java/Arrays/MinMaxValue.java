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
    }

    static void get_MinAndMaxValue_bruteForceAlgo(int[] arr) {
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
//        System.out.println("----------------------------------------------------------------------------------------------");
    }
    //Method-2
    static void getMinMaxValue_ArrSort(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Method-2 - > Min Value = " + arr[0]);
        System.out.println("Method-2 -> Max Value = " + arr[arr.length-1]);
//        System.out.println("********************************************************");
    }
}

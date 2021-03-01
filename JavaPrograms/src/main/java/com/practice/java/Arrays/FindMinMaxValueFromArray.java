/**
 * Author : Bhatt Chandresh
 * Java Array Exercises:
 * Find the maximum and minimum value from an array
 * This coding question was asked at UnravelData.
 */
package com.practice.java.Arrays;

import com.practice.java.Author;

import java.util.Arrays;
import java.util.Scanner;

@Author("Chandresh Bhatt")
public class FindMinMaxValueFromArray {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an Array : ");
        int size = sc.nextInt();
        int[] testArr1 = new int[size];
        int[] result;

        for (int index = 0; index < size; index++) {
            testArr1[index] = sc.nextInt();
        }
        sc.close();

        FindMinMaxValueFromArray min_max_value = new FindMinMaxValueFromArray();
        result = min_max_value.getMinAndMaxValueByBruteForceAlgo(testArr1);
        min_max_value.getResult(result);
        result = min_max_value.getMinMaxValueByArrSort(testArr1);
        min_max_value.getResult(result);
    }

    int[] getMinAndMaxValueByBruteForceAlgo(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int[] result = new int[2];
        for (int index = 0; index < arr.length - 1; index++) {
            if (max < arr[index + 1])
                max = arr[index + 1];
            if (min > arr[index + 1])
                min = arr[index + 1];
        }
        result[0] = min;
        result[1] = max;
        return result;
    }

    int[] getMinMaxValueByArrSort(int[] arr) {
        int[] result = new int[2];
        Arrays.sort(arr);
        result[0] = arr[0];
        result[1] = arr[arr.length - 1];
        return result;
    }

    void getResult(int[] result) {
        int minVal;
        int maxVal;
        minVal = result[0];
        maxVal = result[1];
    }
}

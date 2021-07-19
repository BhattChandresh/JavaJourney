/*
 How To Find Array Triplets Whose Sum Is Equal To Given Number?
 */
package com.practice.java.mypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTriplet {
    private final List<int[]> triplets = new ArrayList<>();

    public static void main(String[] args) {
        ArrayTriplet arrayTriplet = new ArrayTriplet();
        int[] arr1 = {7, 5, 9, 3, 0, 8, 6};
        arrayTriplet.getArrayTripletBruteForce(arr1, 12);
        for (int index = 0; index < arrayTriplet.triplets.size(); index++) {
            System.out.println(Arrays.toString(arrayTriplet.triplets.get(index)));
        }
    }

    //Only for JUnit Test-case
    protected void clearTripletsList() {
        triplets.clear();
    }


    protected List<int[]> getArrayTripletBruteForce(int[] arr, int number) {
        int index = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == number) {
                        int[] value = new int[3];
                        value[index] = arr[i];
                        index++;
                        value[index] = arr[j];
                        index++;
                        value[index] = arr[k];
                        triplets.add(value);
                        index = 0;
                    }
                }
            }
        }
        return triplets;
    }
}
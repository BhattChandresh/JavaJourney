/**
 * How To Find Array Triplets Whose Sum Is Equal To Given Number?
 */
package com.practice.java.mypractice;

public class ArrayTriplet {
    public static void main(String[] args) {
        int[] arr1 = {7, 5, 9, 3, 0, 8, 6};
        int[] arr2 = {17, 51, 39, 29, 33, 21, 65};
        getArrayTriplet(arr1, 12);
        getArrayTriplet(arr2, 89);
    }

    static void getArrayTriplet(int[] arr, int number) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == number)
                        System.out.println("{" + arr[i] + "," + arr[j] + "," + arr[k] + "}");
                }
            }
        }
    }
}

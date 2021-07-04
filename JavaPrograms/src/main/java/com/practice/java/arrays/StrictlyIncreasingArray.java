package com.practice.java.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StrictlyIncreasingArray {
    public static void main(String[] args) {
        StrictlyIncreasingArray increasingArray = new StrictlyIncreasingArray();
        int[] inputArr = {1, 2, 3, 5, 7, 11};
        boolean isIncreasingArr = increasingArray.IsStrictlyIncreasingArr(inputArr);
        if (isIncreasingArr) {
            System.out.println("Given Array is strictly Increasing");
        } else {
            System.out.println("Given Array is not strictly increasing");
        }
    }

    protected boolean IsStrictlyIncreasingArr(int[] inputArr) {
        int arrLength = inputArr.length;
        int itemToRemove = 0;
        List<Integer> list = Arrays.stream(inputArr).boxed().collect(Collectors.toList());
        int[] arr;
        boolean isArrayIncreasing = false;

        for (int index = 0; index < arrLength - 1; index++) {
            if (!(inputArr[index] < inputArr[index + 1])) {
                list.remove(index);
                itemToRemove = inputArr[index];
                isArrayIncreasing = true;
                break;
            }
        }

        if (isArrayIncreasing) {
            arr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                arr[i] = list.get(i);
            }
            for (int index = 0; index < arr.length - 1; index++) {
                if (!(arr[index] < arr[index + 1])) {
                    return false;
                }
            }
        }

        System.out.println("Element to be removed = " + itemToRemove);
        return true;
    }
}

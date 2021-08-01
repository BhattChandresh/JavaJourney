package com.practice.java.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//TODO : JUnit test case to be written.
public class MinimumReduction {
    public static void main(String[] args) {
        MinimumReduction minimumReduction = new MinimumReduction();
        //int[] inputArr = {2, 4, 1, 3};
        //int[] inputArr = {15,11,9,12,5};
        int[] inputArr = {99, 57, 84, 36};
        int result1 = minimumReduction.reduceAndSum(inputArr);
        System.out.println("Sum is = " + result1);
    }

    protected int reduceAndSum(int[] inputArr) {
        List<Integer> arrList = new ArrayList<>();
        int result;
        int sum = 0;
        for (Integer item : inputArr) {
            arrList.add(item);
        }

        while (arrList.size() > 1) {
            Collections.sort(arrList);
            result = arrList.get(0) + arrList.get(1);
            arrList.remove(0);
            arrList.remove(0);
            arrList.add(result);
            sum = sum + result;
        }
        return sum;
    }
}

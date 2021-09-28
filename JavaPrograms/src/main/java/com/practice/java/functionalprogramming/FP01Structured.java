package com.practice.java.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        printAllNumbersInListByTraditionalMethod(Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    private static void printAllNumbersInListByTraditionalMethod(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

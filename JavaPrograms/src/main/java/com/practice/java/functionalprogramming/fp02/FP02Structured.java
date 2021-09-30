package com.practice.java.functionalprogramming.fp02;

import java.util.Arrays;
import java.util.List;

public class FP02Structured {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
        int sum = addNumbersByTraditionalMethod(numbers);
        System.out.println(sum);
    }

    private static int addNumbersByTraditionalMethod(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }
}

package com.practice.java.functionalprogramming.fp02;

import java.util.Arrays;
import java.util.List;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
        int sum = addNumbersByFunctionalApproach(numbers);
        System.out.println(sum);
    }

    private static int addNumbersByFunctionalApproach(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum);
    }
}

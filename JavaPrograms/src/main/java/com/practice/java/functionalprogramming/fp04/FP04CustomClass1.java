package com.practice.java.functionalprogramming.fp04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FP04CustomClass1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 25, 23, 45, 67, 89, 100, 290, 234);

        System.out.println(
                numbers.stream()
                        .max(Comparator.comparing(Integer::intValue))
                        .get().intValue()
        );

        System.out.println(
                numbers.stream()
                        .min(Comparator.comparing(Integer::intValue))
                        .get().intValue()
        );

        System.out.println(
                numbers.stream()
                        .mapToInt(x -> x + 1)
                        .sum()
        );

        System.out.println(
                numbers.stream()
                        .mapToInt(x -> x + 1)
                        .average()
        );

        System.out.println(
                numbers.stream()
                        .filter(x -> x % 2 == 0)
                        .count()
        );


    }
}

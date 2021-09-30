package com.practice.java.functionalprogramming.fp03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FP03BehaviourParameterization {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);

        Predicate<Integer> evenPredicate = x -> x % 2 == 0;
        Predicate<Integer> oddPredicate = x -> x % 2 != 0;
        System.out.println(" --  Even Numbers  --");
        filterAndPrint(numbers, evenPredicate);
        System.out.println(" --  Odd Numbers  --");
        filterAndPrint(numbers, oddPredicate);
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}


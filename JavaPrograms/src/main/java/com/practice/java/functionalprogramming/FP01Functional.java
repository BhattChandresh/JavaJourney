package com.practice.java.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FP01Functional {
    public static void main(String[] args) {
        printAllNumbersInListByTFunctionalApproach(Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    private static void printAllNumbersInListByTFunctionalApproach(List<Integer> numbers) {
        System.out.println("-- Method-1 --");
        numbers
                .forEach(System.out::print);
        System.out.println("-- Method-2 --");
        IntStream.range(0, numbers.size()-1)
                .forEach((index) -> System.out.println(numbers.get(index)));
        System.out.println("-- Method-3 --");
        numbers.stream()
                .forEach(System.out::print);
    }
}

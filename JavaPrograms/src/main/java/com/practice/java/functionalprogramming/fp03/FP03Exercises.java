package com.practice.java.functionalprogramming.fp03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP03Exercises {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);

        Function<Integer, Integer> squareFunction = x -> x * x;
        Function<Integer, Integer> cubeFunction = x -> x * x * x;
        Function<Integer, Integer> doubleFunction = x -> x + x;
        List<Integer> squares = performOperation(numbers, squareFunction);
        System.out.println("Squares = " + squares);
        List<Integer> cubes = performOperation(numbers, cubeFunction);
        System.out.println("Cubs = " + cubes);
        List<Integer> doubleNumber = performOperation(numbers, doubleFunction);
        System.out.println("Double = " + doubleNumber);
    }

    private static List<Integer> performOperation(List<Integer> numbers, Function<Integer, Integer> function) {
        return numbers.stream()
                .map(function)
                .collect(Collectors.toList());
    }
}

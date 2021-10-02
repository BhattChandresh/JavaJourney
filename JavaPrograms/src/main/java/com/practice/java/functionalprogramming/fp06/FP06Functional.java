package com.practice.java.functionalprogramming.fp06;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FP06Functional {
    public static void main(String[] args) {
        int sumOf1To9 = IntStream.range(1,10).sum();
        System.out.println("sumOf1To9 = " +  sumOf1To9);

        System.out.println("----------------------------------------------------------------");

        int sumOf1To10 = IntStream.rangeClosed(1,10).sum();
        System.out.println("sumOf1To10 = " +  sumOf1To10);

        System.out.println("----------------------------------------------------------------");

        int result1 = IntStream.iterate(1, x -> x+2).limit(10).sum();
        System.out.println(result1);

        System.out.println("----------------------------------------------------------------");

        int result2 = IntStream.iterate(1, x-> x+2).limit(10).peek(System.out::println).sum();
        System.out.println(result2);

        System.out.println("----------------------------------------------------------------");

        int result3 = IntStream.iterate(2, x->x+2).limit(10).peek(System.out::println).sum();
        System.out.println(result3);

        System.out.println("----------------------------------------------------------------");

        //Collect the primitive stream to list
        List<Integer> list1 = IntStream.iterate(2, x -> x * 2).limit(10).boxed().collect(Collectors.toList());
        System.out.println(list1);

        System.out.println("----------------------------------------------------------------");
    }
}

package com.practice.java.functionalprogramming.fp02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Exercises {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> courses =
                Arrays.asList("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
        int result1 = squareEachNumberAndGetSumOfAll(intList);
        System.out.println("Sum of Square = " + result1);
        System.out.println("---------------------------------------------------------------------");
        int result2 = cubeEachNumberAndGetSumOfAll(intList);
        System.out.println("Cube of Square = " + result2);
        System.out.println("---------------------------------------------------------------------");
        int result3 = sumOfOddNumbers(intList);
        System.out.println("sumOfOddNumbers = " + result3);
        System.out.println("---------------------------------------------------------------------");
        List<Integer> evenNumberList = getEvenNumbers(intList);
        System.out.println("Even Numbers List = " + evenNumberList);
        System.out.println("---------------------------------------------------------------------");
        List<Integer> listOfLengthOfChar = getLengthOfCourseName(courses);
        System.out.println(listOfLengthOfChar);
    }

    private static List<Integer> getLengthOfCourseName(List<String> courses) {
        return courses.stream()
                .map((str) -> str.length())
                .collect(Collectors.toList());
    }

    private static List<Integer> getEvenNumbers(List<Integer> list) {
        return list.stream()
                            .filter((number) -> number % 2 == 0)
                            .collect(Collectors.toList());
    }

    private static int sumOfOddNumbers(List<Integer> list) {
        return list.stream()
                .filter((number) -> number % 2 != 0)
                .reduce(0, Integer::sum);
    }

    private static int cubeEachNumberAndGetSumOfAll(List<Integer> list) {
        return list.stream()
                .map((number) -> number * number * number)
                .reduce(0, Integer::sum);
    }

    private static int squareEachNumberAndGetSumOfAll(List<Integer> list) {
        return list.stream()
                .map((number) -> number * number)
                .reduce(0, Integer::sum);
    }
}

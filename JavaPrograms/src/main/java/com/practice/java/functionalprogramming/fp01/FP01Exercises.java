package com.practice.java.functionalprogramming.fp01;

import java.util.Arrays;
import java.util.List;

public class FP01Exercises {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printOddNumbersFromList(intList);
        System.out.println("---------------------------------------------------------------------");
        List<String> courses =
                Arrays.asList("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
         printAllCourses(courses);
        System.out.println("---------------------------------------------------------------------");
        printCousersWithSpring(courses);
        System.out.println("---------------------------------------------------------------------");
        printCoursesWithMinLenEqualFour(courses);
        System.out.println("---------------------------------------------------------------------");
        printSquareOfEvenNumbers(intList);
        System.out.println("---------------------------------------------------------------------");
        printCubeOfOddNumbers(intList);
        System.out.println("---------------------------------------------------------------------");
        printLengthOfEachCourse(courses);
    }

    private static void printLengthOfEachCourse(List<String> courses) {
        courses.stream()
                .map((word) -> word + " -> " + word.length())
                .forEach(System.out::println);
    }

    private static void printCubeOfOddNumbers(List<Integer> intList) {
        intList.stream()
                .filter((number) -> number %2 != 0)
                .map((number) -> number * number * number)
                .forEach(System.out::println);
    }

    private static void printSquareOfEvenNumbers(List<Integer> intList) {
        intList.stream()
                .filter((number) -> number % 2 == 0)
                .map((evenNumber) -> evenNumber * evenNumber)
                .forEach(System.out::println);
    }

    private static void printCoursesWithMinLenEqualFour(List<String> courses) {
        courses.stream()
                .filter((word) -> word.length() >=4)
                .forEach(System.out::println);
    }

    private static void printCousersWithSpring(List<String> courses) {
        courses.stream()
                .filter((word) -> word.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printOddNumbersFromList(List<Integer> intList) {
        intList.stream()
                .filter((number) -> number %2 != 0)
                .forEach(System.out::println);
    }
}

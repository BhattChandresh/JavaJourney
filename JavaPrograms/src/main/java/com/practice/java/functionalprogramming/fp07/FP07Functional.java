package com.practice.java.functionalprogramming.fp07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FP07Functional {
    public static void main(String[] args) {
        List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "FullStack", "AWS", "Azure", "Docker", "Kubernetes");

        String str1 = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println("Join the String = " + str1);


        List<String> list1 = courses.stream()
                .map(course -> course.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(list1);

        List<String> list2 = courses.stream()
                .map(course -> course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(list2);

    }
}

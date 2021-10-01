package com.practice.java.functionalprogramming.fp04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP04CustomClass {
    public static void main(String[] args) {
        List<Course> courses = Arrays.asList(new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000));

        //allMatch,noneMatch and anyMatch
        Predicate<Course> courseReviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;
        Predicate<Course> courseReviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
        allMatchPredicate(courses, courseReviewScoreGreaterThan90Predicate);
        allMatchPredicate(courses, courseReviewScoreGreaterThan95Predicate);

        Predicate<Course> courseReviewScoreLessThan90Predicate = course -> course.getReviewScore() < 90;
        noneMatchPredicate(courses, courseReviewScoreLessThan90Predicate);
        anyMatchPredicate(courses, courseReviewScoreGreaterThan90Predicate);
        anyMatchPredicate(courses, courseReviewScoreLessThan90Predicate);


        //Comparator Use cases
        Comparator<Course> comparingByNoOfStudentAscending =
                Comparator.comparing(Course::getNoOfStudent);
        List<Course> sortByStudentCount =
                courses.stream()
                        .sorted(comparingByNoOfStudentAscending)
                        .collect(Collectors.toList());
        System.out.println(sortByStudentCount);

        Comparator<Course> comparingByNoOfStudentDescending = Comparator.comparing(Course::getNoOfStudent).reversed();
        List<Course> sortByStudentCountDescending =
                courses.stream()
                        .sorted(comparingByNoOfStudentDescending)
                        .collect(Collectors.toList());
        System.out.println(sortByStudentCountDescending);

        Comparator<Course> comparingByNoOfStudentAndNoOfReviews =
                Comparator.comparing(Course::getNoOfStudent)
                .thenComparing(Course::getReviewScore)
                .reversed();
        List<Course> list1 = courses.stream()
                .sorted(comparingByNoOfStudentAndNoOfReviews)
                .collect(Collectors.toList());
        System.out.println(list1);

        System.out.println("** ** ** ** **");
        //Limit, Skip
        System.out.println(courses.stream()
                .sorted(comparingByNoOfStudentAndNoOfReviews)
                .limit(5)
                .collect(Collectors.toList()));

        System.out.println(courses.stream()
                .sorted(comparingByNoOfStudentAndNoOfReviews)
                .skip(3)
                .collect(Collectors.toList()));

        System.out.println(courses.stream()
                .sorted(comparingByNoOfStudentAndNoOfReviews)
                .skip(3)
                .limit(5)
                .collect(Collectors.toList()));

        System.out.println(
                courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory))
        );

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting()))
        );
    }

    private static void allMatchPredicate(List<Course> courses, Predicate<Course> courseReviewScorePredicate) {
        boolean b = courses.stream().allMatch(courseReviewScorePredicate);
        System.out.println("AllMatch Predicate = " + b);
    }

    private static void noneMatchPredicate(List<Course> courses, Predicate<Course> courseReviewScorePredicate) {
        boolean b = courses.stream().noneMatch(courseReviewScorePredicate);
        System.out.println("noneMatch Predicate = " + b);
    }

    private static void anyMatchPredicate(List<Course> courses, Predicate<Course> courseReviewScorePredicate) {
        boolean b = courses.stream().anyMatch(courseReviewScorePredicate);
        System.out.println("anyMatch Predicate = " + b);
    }
}

class Course {
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudent;

    public Course(String name, String category, int reviewScore, int noOfStudent) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudent = noOfStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudent() {
        return noOfStudent;
    }

    public void setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
    }

    public String toString() {
        return name + ":" + category + ":" + reviewScore + ":" + noOfStudent;
    }
}

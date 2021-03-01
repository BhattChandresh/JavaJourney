/**
 * Predicate
 * Function
 * Consumer
 * Supplier
 * etc.
 * This functional interfaces defined in package java.util.function
 */
package com.practice.java.java8.lambda;

import com.practice.java.Author;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@Author("Chandresh Bhatt")
public class PredefinedFunctionInterfaces {
    public static void main(String[] args) {
        /* Predicate Demo */
        // Check whether given value is > 25 or not
        Predicate<Integer> p = i -> i > 25;
        System.out.println(p.test(124));
        System.out.println(p.test(23));
        // Check whether given string length is > 5
        Predicate<String> p1 = s -> s.length() > 5;
        System.out.println(p1.test("Java 8"));
        System.out.println(p1.test("ABC"));

        //Predicate Joining
        // p3  -> Given no is > 15 or not
        // p4 -> Given no is Even or not

        // TO BE IMPLEMENTED

        /* Function  Demo*/
        // FInd the length of given String
        Function<String, Integer> f1 = s -> s.length();
        System.out.println(f1.apply("Java 8"));
        System.out.println(f1.apply("Learning Java 8 is fun"));

        //FInd the square of given no.
        Function<Integer, Integer> f2 = i -> i * i;
        System.out.println(f2.apply(50));
        System.out.println(f2.apply(100));

        /* Consumer Demo */
        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("Java-8");

    }
}

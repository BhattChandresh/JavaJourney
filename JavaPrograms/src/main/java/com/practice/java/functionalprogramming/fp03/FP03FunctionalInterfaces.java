package com.practice.java.functionalprogramming.fp03;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP03FunctionalInterfaces {
    public static void main(String[] args) {

        //Predicate Functional Interface
        //Input : Any, Return : boolean
        System.out.println("--- Predicate Functional Interface ---");
        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
        System.out.println(isEvenPredicate.test(12));
        System.out.println(isEvenPredicate.test(9));

        System.out.println("--- Function Functional Interface ---");

        //Function Functional Interface
        Function<Integer, Integer> squareFunction = x -> x * x;
        System.out.println(squareFunction.apply(4));
        System.out.println(squareFunction.apply(5));

        System.out.println("--- Consumer Functional Interface ---");
        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(6);

        System.out.println("--- Supplier Functional Interface ---");
        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };
        System.out.println(supplier.get());

        System.out.println("--- BinaryOperator Functional Interface ---");
        //BinaryOperator - reduce terminal operation uses the binary operator
        BinaryOperator<Integer> sumBinaryOperator = (x, y) -> x + y;
        System.out.println(sumBinaryOperator.apply(10, 15));

        System.out.println("--- UnaryOperator Functional Interface ---");
        UnaryOperator<Integer> unaryOperator = x -> 3 * x;
        System.out.println(unaryOperator.apply(4));

        System.out.println("--- BiPredicate Functional Interface ---");
        BiPredicate<Integer, String> biPredicateFunc = (num, str) -> num < 10 && str.length() > 5;
        System.out.println(biPredicateFunc.test(8, "SpringBoot"));
        System.out.println(biPredicateFunc.test(9, "Java"));

        System.out.println("--- BiFunction Functional Interface ---");
        BiFunction<Integer, String, String> biFunction = (num, str) -> str.concat(" -> ").concat(Integer.toString(num));
        System.out.println(biFunction.apply(8, "Java And Stream API"));

        System.out.println("--- BiConsumer Functional Interface ---");
        BiConsumer<String, String> biConsumerFunc = (s1, s2) -> {
            System.out.println(s1);
            System.out.println(s2);
        };
        biConsumerFunc.accept("Chandresh", "Bhatt");
    }
}

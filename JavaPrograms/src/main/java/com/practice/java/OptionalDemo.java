package main.java.com.practice.java;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<Integer>  optional = Optional.of(5); //By default, non null values
        System.out.println(optional.isEmpty());   //false
        System.out.println(optional.isPresent()); // true
        System.out.println(optional.get()); //5

        Optional<Integer> optional1 = Optional.ofNullable(null);
        Optional<Integer> optional2 = Optional.ofNullable(5);
        System.out.println(optional1.isEmpty()); //true
        System.out.println(optional1.isPresent()); //false
        System.out.println(optional2.isEmpty()); //false
        System.out.println(optional2.isPresent()); //true

        Optional<Integer> op1 = Optional.empty();
        Integer i = op1.orElse(Integer.parseInt("10"));
        if (!op1.isPresent()) {
            System.out.println("Value is not present");
        }

    }
}

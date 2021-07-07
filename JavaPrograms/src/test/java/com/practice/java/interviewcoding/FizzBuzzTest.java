package com.practice.java.interviewcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void testFizzOrBuzzOrFizzBuzz() {
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"},
                fizzBuzz.fizzOrBuzzOrFizzBuzz(15));
        assertArrayEquals(new String[]{"1", "2", "Fizz"}, fizzBuzz.fizzOrBuzzOrFizzBuzz(3));
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, fizzBuzz.fizzOrBuzzOrFizzBuzz(5));
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}, fizzBuzz.fizzOrBuzzOrFizzBuzz(7));
    }
}
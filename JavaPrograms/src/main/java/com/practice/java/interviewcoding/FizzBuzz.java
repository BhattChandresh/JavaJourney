/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i if non of the above conditions are true.
 */
package com.practice.java.interviewcoding;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        String[] str = fizzBuzz.fizzOrBuzzOrFizzBuzz(number);
        System.out.println(Arrays.toString(str));
    }

    protected String[] fizzOrBuzzOrFizzBuzz(int number) {
        String[] result = new String[number];
        int start = 1;

        IntStream.rangeClosed(start, number).forEach((index) -> {
                    String strResult;
                    if (index % 3 == 0 && index % 5 == 0) {
                        strResult = "FizzBuzz";
                    } else if (index % 3 == 0) {
                        strResult = "Fizz";
                    } else if (index % 5 == 0) {
                        strResult = "Buzz";
                    } else {
                        strResult = Integer.toString(index);
                    }
                    result[index - 1] = strResult;
                });
        return result;
    }
}

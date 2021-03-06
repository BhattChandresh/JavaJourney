package com.practice.java.mypractice;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long input = scan.nextLong();
        scan.close();
        ReverseInteger reverseInteger = new ReverseInteger();
        long result = reverseInteger.reverseMethod1(input);
        System.out.println("Reversed Integer is : " + result);
    }

    long reverseMethod1(long x) {
        long m;
        long result = 0;
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = Math.abs(x);
        }
        String str = Long.toString(x);
        int power = str.length() - 1;
        for (int index = 0; index < str.length(); index++) {
            m = x % 10;
            x = x / 10;
            result = result + (m * (long) Math.pow(10, power));
            power -= 1;
        }
        if (isNegative) {
            result = -result;
        }
        return result;
    }
}

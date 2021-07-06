package com.practice.java.interviewcoding;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PerfectSquare perfectSquare = new PerfectSquare();
        int input = sc.nextInt();
        sc.close();
        boolean isPerfect = perfectSquare.isPerfectSquare(input);
        System.out.println(isPerfect);
    }

    protected boolean isPerfectSquare(int number) {
        int start = 1, end = number;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (mid * mid == number) {
                return true;
            }

            if (mid * mid < number) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}

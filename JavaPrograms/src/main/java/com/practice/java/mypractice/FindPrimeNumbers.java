package com.practice.java.mypractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        FindPrimeNumbers primeNumbers = new FindPrimeNumbers();
        Scanner sc = new Scanner(System.in);
        int upperLimit = sc.nextInt();
        sc.close();
        primeNumbers.findPrimeNumbersInRange(upperLimit);
    }

    List<Integer> findPrimeNumbersInRange(int upperLimit) {
        List<Integer> primeNumberList = new ArrayList<>();

        if (upperLimit <= 1) {
            System.out.println("Prime numbers starts from digit 2, Please enter valid range");
        }

        for (int index = 2; index < upperLimit; index++) {
            boolean isDivisibleByFactor = false;

            if (index == 2 || index == 3) {
                primeNumberList.add(index);
                continue;
            }

            if (index % 2 == 0) {
                continue;
            }

            for (int factor = 3; factor <= Math.sqrt(index); factor += 2) {
                if (index % factor == 0) {
                    isDivisibleByFactor = true;
                    break;
                }
            }

            if (!(isDivisibleByFactor)) {
                primeNumberList.add(index);
            }
        }
        return primeNumberList;
    }
}

/**
 * Count number of 1’s in binary representation of a number.
 */

package com.practice.java.mypractice;

import com.practice.java.Author;

import java.util.Scanner;

@Author("Chandresh Bhatt")
public class CountOneInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        CountOneInNumber countOneInNumber = new CountOneInNumber();
        countOneInNumber.countOnes(number);
    }

    int countOnes(int number) {
        int count = 0;
        int iteration = 0;
        while (number != 0) {
            number = number & (number - 1);
            iteration++;
            count++;
        }
        System.out.println("No of 1's in Number = " + count);
        System.out.println("No. of Iteration = " + iteration);
        return count;
    }
}

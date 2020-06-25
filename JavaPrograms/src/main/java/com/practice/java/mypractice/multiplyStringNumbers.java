/**
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
 * Example 1:
 *       Input: num1 = "2", num2 = "3"
 *      Output: "6"
 * Example 2:
 *      Input: num1 = "123", num2 = "456"
 *      Output: "56088"
 *
 */
package com.practice.java.mypractice;

import com.practice.java.Author;

import java.util.Scanner;

@Author("Bhatt Chandresh")
public class multiplyStringNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers in the String format");
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        multiplyStrNumbers(num1,num2);
    }

    static void multiplyStrNumbers(String num1, String num2) {
        int length1 = num1.length();
        int length2 = num2.length();
        int number1 = 0;
        int temp = 0;
        int number2 = 0;
        int i = 0;

        for(int index1=length1-1;index1 > -1;index1--) {
            if(i == 0) {
                number1 = Character.digit(num1.charAt(index1), 10);
             }
            else {
                temp = Character.digit(num1.charAt(index1),10);
                temp = temp * (int) Math.pow(10.0d, i);
                number1 = number1 + temp;
             }
            i = i+1;
        }

        i = 0;
        for(int index1=length2-1;index1 > -1;index1--) {
            if(i == 0) {
                number2 = Character.digit(num2.charAt(index1), 10);
            }
            else {
                temp = Character.digit(num2.charAt(index1),10);
                temp = temp * (int) Math.pow(10.0d, i);
                number2 = number2 + temp;
            }
            i = i+1;
        }
        System.out.println("First Number = " + number1);
        System.out.println("Second Number = " + number2);

        System.out.println(number1 * number2);

        String result = Integer.toString(number1 * number2);
        System.out.println(result);
   }
}

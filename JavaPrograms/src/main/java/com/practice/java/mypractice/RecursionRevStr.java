/**
 * Author : Chandresh Bhatt
 * Write a program to reverse the Java String using recursion.
 */
package com.practice.java.mypractice;

public class RecursionRevStr {
    public static String result = "";

    public static void main(String[] args) {
        //String str = "ABCD";
        String str = "String Reverse With Recursion";
        int len = str.length() - 1;
        String rev = reverse(str, len);
        System.out.println("Reverse String is : " + rev);
    }

    public static String reverse(String str, int len) {
        if (len > -1) {
            result = result + str.charAt(len);
            reverse(str, len - 1);
        }
        return result;
    }
}

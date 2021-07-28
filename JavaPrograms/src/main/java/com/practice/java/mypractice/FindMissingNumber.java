/*
  Author : Chandresh Bhatt
  Find the Missing Number
  You are given a list of n-1 integers and these integers are in the range of 1 to n.
  There are no duplicates in the list.
  One of the integers is missing in the list. Write an efficient code to find the missing integer.
 */
package com.practice.java.mypractice;

public class FindMissingNumber {
    public static void main(String[] args) {
        FindMissingNumber findMissingNumber = new FindMissingNumber();
        int missingNo = findMissingNumber.getMissingNumber(new int[]{});
        System.out.println(missingNo);
    }

    int getMissingNumber(int[] arr) {
        int total;
        int arrSum = 0;
        total = ((arr.length + 1) * (arr.length + 1 + 1)) / 2;
        for (int value : arr) {
            arrSum = arrSum + value;
        }
        System.out.println("Sum : " + total + "-" + arrSum);
        System.out.println("Missing number is : " + (total - arrSum));
        return total - arrSum;
    }
}

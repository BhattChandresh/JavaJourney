package com.practice.java.mypractice;

import java.util.HashSet;
import java.util.Scanner;

public class MaxLengthStrWithOutRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();
        //String s = "abdbcefghAailmnfpqrs";
        //String s = "Chandresh";
        findMaxLength(s);
    }

    static void findMaxLength(String s) {
        HashSet<Character> set = new HashSet<>();
        int head = 0;
        int tail;
        StringBuilder result = new StringBuilder();
        boolean isDuplicate;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            isDuplicate = set.add(c[i]);
            if (!isDuplicate) {
                tail = i;
                String internal = s.substring(head, tail);
                if (internal.charAt(0) == internal.charAt(1))
                    internal = internal.substring(1);
                result.append(internal).append(",");
                head = tail - 1;
                i = tail - 1;
                set.clear();
            }
        }
        if (!set.isEmpty()) {
            String internal = s.substring(head);
            if (internal.charAt(0) == internal.charAt(1))
                internal = internal.substring(1);
            result.append(internal);
        }
        String[] str = result.toString().split(",");
        for (String value : str) {
            System.out.println("String = " + value + ", Length =" + value.length());
        }
    }
}


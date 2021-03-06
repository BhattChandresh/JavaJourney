package com.practice.java.mypractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// TODO : NEED TO IMPROV E THE PROGRAM M. WILL DO IT LATER.

public class ReverseStrWithOutSpecialChar {
    public static void main(String[] args) {
        String str1 = "abc$dfh%";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        ReverseStrWithOutSpecialChar reverseStrWithOutSpecialChar = new ReverseStrWithOutSpecialChar();
        String result1 = reverseStrWithOutSpecialChar.reverse_Method1(str);
        String result2 = reverseStrWithOutSpecialChar.reverse_Method2(str);
        System.out.println(str1);
        System.out.println(result1 + ", " + result2);
    }

    // Method-1
    String reverse_Method1(String s) {
        if (s.isEmpty()) {
            System.out.println("Given String is Empty");
            return "";
        }
        char[] c = s.toCharArray();
        Map<Integer, Character> m1 = new HashMap<>();
        for (int i = 0; i < c.length; i++) {
            if (!((c[i] >= 65 && c[i] <= 90) || (c[i] >= 97 && c[i] <= 122)))
                m1.put(i, c[i]);
        }
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String s1 = sb.toString();

        String s2 = s1.replaceAll("[^a-zA-z]", "");
        StringBuilder sb1 = new StringBuilder(s2);

        for (Map.Entry entry : m1.entrySet()) {
            sb1 = sb1.insert((int) entry.getKey(), (char) entry.getValue());
        }
        return sb1.toString();
    }

    // Method-2
    String reverse_Method2(String str) {
        if (str.isEmpty()) {
            System.out.println("Given String is Empty");
            return "";
        }
        char[] c = str.toCharArray();
        int right = str.length() - 1, left = 0;
        while (left < right) {
            if (!Character.isAlphabetic(c[left]))
                left++;
            else if (!Character.isAlphabetic(c[right]))
                right--;
            else {
                char tmp = c[left];
                c[left] = c[right];
                c[right] = tmp;
                left++;
                right--;
            }
        }
        return null;
    }
}

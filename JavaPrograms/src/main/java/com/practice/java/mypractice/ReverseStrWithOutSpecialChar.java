package com.practice.java.mypractice;

import java.util.HashMap;
import java.util.Map;

// TODO : NEED TO IMPROV E THE PROGRAM M. WILL DO IT LATER.

public class ReverseStrWithOutSpecialChar {
    public static void main(String[] args) {
        String str1 = "abc$dfh%";
        String result1 = reverse_Method1(str1);
        String result2 = reverse_Method2(str1);
        System.out.println(str1);
        System.out.println(result1 + ", " + result2);
    }

    // Method-1
    static String reverse_Method1(String s) {
        char[] c = s.toCharArray();
        char[] c1 = new char[c.length];
        Map<Integer, Character> m1 = new HashMap<Integer, Character>();
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
    static String reverse_Method2(String str) {
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

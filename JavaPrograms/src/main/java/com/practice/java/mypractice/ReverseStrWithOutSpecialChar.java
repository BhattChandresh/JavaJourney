package com.practice.java.mypractice;

import java.util.HashMap;
import java.util.Map;

public class ReverseStrWithOutSpecialChar {
    public static void main(String[] args) {
        String str = "abc$dfh%";
        String result = reverse(str);
        System.out.println(str);
        System.out.println(result);
    }
    static String reverse(String s) {
        char[] c = s.toCharArray();
        char[] c1 = new char[c.length];
        Map<Integer,Character> m1 = new HashMap<Integer,Character>();
        for(int i=0;i< c.length;i++) {
            if (!((c[i] >= 65 && c[i] <= 90) || (c[i] >= 97 && c[i] <= 122)))
                m1.put(i, c[i]);
        }
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String s1 = sb.toString();


        String s2 = s1.replaceAll("[^a-zA-z]", "");
        StringBuilder sb1 = new StringBuilder(s2);

        for(Map.Entry entry:m1.entrySet()){
            sb1 = sb1.insert((int) entry.getKey(), (char) entry.getValue());
        }
        return sb1.toString();
    }
}

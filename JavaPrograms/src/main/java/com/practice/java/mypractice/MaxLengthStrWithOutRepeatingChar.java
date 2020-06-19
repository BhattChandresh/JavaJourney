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
        HashSet set = new HashSet();
        int head = 0;
        int tail = 0;
        String result = "";
        boolean isDuplicate = false;
        char[] c = s.toCharArray();
        for(int i=0; i < c.length;i++) {
            isDuplicate = set.add(c[i]);
            if(!isDuplicate) {
                tail = i;
                String internal = s.substring(head,tail);
                if(internal.charAt(0) == internal.charAt(1))
                    internal = internal.substring(1,internal.length());
                result = result + internal + ",";
                head = tail - 1;
                i = tail -1;
                set.clear();
            }
        }
        if(!set.isEmpty()) {
            String internal = s.substring(head,s.length());
            if(internal.charAt(0) == internal.charAt(1))
                internal = internal.substring(1,internal.length());
            result = result + internal;
        }
        String[] str = result.split(",");
        int length = 0;
        for(int i=0; i < str.length;i++) {
           System.out.println("String = " + str[i] + ", Length =" + str[i].length() );
        }
    }
}


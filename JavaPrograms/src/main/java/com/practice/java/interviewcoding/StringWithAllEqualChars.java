/**
 * String1 -- "aaabb"
 * String2 -- "aaabbbb"
 * String3 -- "aaabbb"
 * These are sample strings. The problem stated that a given string has to be cut in such a fashion that the remaining characters in the string,
 * say a and b have same character count. If not, then the method returns false.
 * In case the string already has characters with same frequency of occurrence as in case 3, then just return true.
 * Return type can be assumed to be Boolean.
 * Test Cases :
 * # aaabb -> false
 * # aaabbbb => false
 * # aaabbb -> true
 * # abcde -> true
 * # abab -> true
 * # bbbcacaac -> true
 */
package com.practice.java.interviewcoding;

import com.practice.java.Author;

import java.util.*;

@Author("Chandresh Bhatt")
public class StringWithAllEqualChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        boolean isOk = checkCharEquality(input);
        System.out.println(isOk);
    }

    static boolean checkCharEquality(String input) {
        // Method-1
        if (input.isEmpty())
            return false;
        Set<Character> set = new HashSet<Character>();
        List<Integer> list = new ArrayList<Integer>();
        boolean isRepeat = false;
        int count = 0;
        boolean isEven = false;
        char[] c = input.toCharArray();
        Arrays.sort(c);
        System.out.println(c);
        for (int i = 0; i < c.length; i++) {
            isRepeat = set.add(c[i]);
            if (isRepeat) {
                if (count != 0)
                    list.add(count);
                count = 1;
            } else
                count = count + 1;
        }
        list.add(count);

        int check = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (check == list.get(i))
                isEven = true;
            else
                isEven = false;
        }
        return isEven;
    }
}

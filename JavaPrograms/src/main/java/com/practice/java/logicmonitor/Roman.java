/*
Create a function that takes a Roman numeral as its argument and returns its value as a numeric decimal integer. You don't need to validate the form of the Roman numeral.

Modern Roman numerals are written by expressing each decimal digit of the number to be encoded separately, starting with the leftmost digit and skipping any 0s. So 1990 is rendered "MCMXC" (1000 = M, 900 = CM, 90 = XC) and 2008 is rendered "MMVIII" (2000 = MM, 8 = VIII). The Roman numeral for 1666, "MDCLXVI", uses each letter in descending order.


 */
package com.practice.java.logicmonitor;

import java.util.HashMap;
import java.util.Map;

public class Roman {
    public static void main(String[] args) {
        Integer i = decode("XXI");
        System.out.println(i);
    }

    public static Integer decode(String roman) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            if (i > 0 && map.get(roman.charAt(i)) > map.get(roman.charAt(i - 1))) {
                result += map.get(roman.charAt(i)) - 2 * map.get(roman.charAt(i - 1));
            } else {
                result += map.get(roman.charAt(i));
            }
        }
        return result;
    }
}

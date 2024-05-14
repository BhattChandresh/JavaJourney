/**
 * You are given a string word that consists of digits and lowercase English letters.
 * You will replace every non-digit character with a space. For example, "a123bc34d8ef34" will become " 123  34 8  34". Notice that you are left with some integers that are separated by at least one space: "123", "34", "8", and "34".
 * Return the number of different integers after performing the replacement operations on word.
 * Two integers are considered different if their decimal representations without any leading zeros are different.
 * <p>
 * Example 1:
 * Input: word = "a123bc34d8ef34"
 * Output: 3
 * Explanation: The three different integers are "123", "34", and "8". Notice that "34" is only counted once.
 * Example 2:
 * Input: word = "leet1234code234"
 * Output: 2
 * Example 3:
 * Input: word = "a1b01c001"
 * Output: 1
 * Explanation: The three integers "1", "01", and "001" all represent the same integer because
 * the leading zeros are ignored when comparing their decimal values.
 * <p>
 * Constraints:
 * 1 <= word.length <= 1000
 * word consists of digits and lowercase English letters.
 */

package main.java.com.practice.java.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferentIntegerInString {
    public static void main(String[] args) {

        //String word = "a123bc34d8ef34";
        //String word = "leet1234code234";
        //String word = "a1b01c001";
        //String word = "u";
        String word = "035985750011523523129774573439111590559325";


        DifferentIntegerInString integerInString = new DifferentIntegerInString();
        int result = integerInString.numDifferentIntegers(word);
        System.out.println("Different Integers in String are : " + result);
    }

    public int numDifferentIntegers(String word) {

        StringBuilder s = new StringBuilder(word);
        Set<String> set = new HashSet<>();

        for (int m = 0; m < word.length(); m++) {
            if (!(word.charAt(m) >= 48 && word.charAt(m) <= 57)) {
                s.setCharAt(m, ' ');
            }
        }

        word = s.toString().replaceAll("\\s+", " ").trim();
        if (word.isEmpty()) {
            return 0;
        }
        List<String> list = Arrays.asList(word.split(" "));

        for (int u = 0; u < list.size(); u++) {
            String str = list.get(u);
            if (str.startsWith("0")) {
                str = str.replaceAll("^0*", "");
                set.add(str);
                continue;
            }
            set.add(list.get(u));
        }
        return set.size();
    }
}

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

  * Example 1:
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

 * Example 2:
 * Input: digits = ""
 * Output: []

 * Example 3:
 * Input: digits = "2"
 * Output: ["a","b","c"]

 * Constraints:
  * 0 <= digits.length <= 4
 * digits[i] is a digit in the range ['2', '9'].
 *
 */

package main.java.com.practice.java.string;

import java.util.*;

public class LetterCombinationPhoneNumber {


    public static void main(String[] args) {
        //String input = "23";
        //String input = "2";
        String input = "";
        LetterCombinationPhoneNumber combination = new LetterCombinationPhoneNumber();
        List<String> letterCombination =  combination.letterCombinations(input);
        System.out.println(Arrays.toString(letterCombination.toArray()));
    }

    public List<String> letterCombinations(String digits) {
        Map<String, String> mapWords = new HashMap<>();
        List<String> letterCombination = new ArrayList<>();

        mapWords.put("2", "abc");
        mapWords.put("3", "def");
        mapWords.put("4", "ghi");
        mapWords.put("5","jkl");
        mapWords.put("6", "mno");
        mapWords.put("7", "pqrs");
        mapWords.put("8", "tuv");
        mapWords.put("9", "wxyz");

        if (digits.isEmpty()) {
            return letterCombination;
        }

        for(int i = digits.length()-1; i > -1 ; i--) {
            String temp = String.valueOf(digits.charAt(i));
            String out = mapWords.get(temp);

            if(letterCombination.isEmpty()) {
                for(int j=0 ; j < out.length();j++) {
                    String str = String.valueOf(out.charAt(j));
                    letterCombination.add(str);
                }
            } else {
                int itr = letterCombination.size();
                List<String> tempList = new ArrayList<>(letterCombination);
                letterCombination.clear();
                for (int k = 0; k < out.length(); k++) {
                    String str = String.valueOf(out.charAt(k));
                    for (int z = 0; z < itr; z++) {
                        StringBuilder s = new StringBuilder();
                        s.append(str).append(tempList.get(z));
                        letterCombination.add(s.toString());
                    }
                }
            }
        }
        return letterCombination;
    }
}

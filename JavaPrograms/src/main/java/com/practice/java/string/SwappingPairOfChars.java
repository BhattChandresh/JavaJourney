/**
 * Given string str, the task is to write a Java program to swap the pairs of characters of a string.
 * If the string contains an odd number of characters then the last character remains as it is.
 */
package main.java.com.practice.java.string;

import java.util.Arrays;

public class SwappingPairOfChars {
    public static void main(String[] args) {
        //String input = "Java";
        String input = "GeeksForGeeks";
        String result = "";

        SwappingPairOfChars pairOfChars = new SwappingPairOfChars();

        result = pairOfChars.swappingPairs(input);
        System.out.println("Result of swapping of characters is : " + result);

        //result = pairOfChars.swappingPairsJava8(input);
        //System.out.println("Result of swapping of characters is : " + result);
    }

    public String swappingPairs(String input) {

        char[] chars = input.toCharArray();
        StringBuilder s = new StringBuilder();
        int charArrLength = chars.length;

        if(charArrLength % 2 == 0) {
            for(int r=0 ; r < charArrLength; r = r+2) {
                s.append(chars[r+1]);
                s.append(chars[r]);
            }
        } else {
            char last = input.charAt(charArrLength - 1);
            for(int r =0; r < charArrLength - 2; r = r+2) {
                s.append(chars[r+1]);
                s.append(chars[r]);
            }
            s.append(last);
        }
        return s.toString();
    }
}

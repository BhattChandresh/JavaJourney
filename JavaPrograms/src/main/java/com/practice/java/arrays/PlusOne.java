/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 * <p>
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * <p>
 * Example 2:
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * <p>
 * Example 3:
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 * <p>
 * Constraints:
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 */

package main.java.com.practice.java.arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        System.out.println();
        //int[] input = {1,2,3};
        //int[] input = {4,3,2,1};
        int[] input = {9};
        //int[] input = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        //int[] input = {1,2,9};
        //int[] input = {8, 9, 9};
        //int[] input = {9, 9, 9};

        int[] result = plusOne.plusOne(input);
        System.out.println(Arrays.toString(result));
    }

    public int[] plusOne(int[] digits) {
        int arrLength = digits.length;
        for (int k = arrLength - 1; k > -1; k--) {
            if (digits[k] == 9) {
                digits[k] = 0;
            } else {
                digits[k]++;
                return digits;
            }
        }
        digits = new int[arrLength + 1];
        digits[0] = 1;
        return digits;
    }
}



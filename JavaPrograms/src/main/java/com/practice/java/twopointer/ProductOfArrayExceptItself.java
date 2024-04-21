/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 * Constraints:
 * 2 <= nums.length <= 105
 * -30 <= nums[i] <= 30
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
 */


package main.java.com.practice.java.twopointer;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};   //24, 12, 8,  6
        ProductOfArrayExceptItself product = new ProductOfArrayExceptItself();
        int[] result_bruteForce = product.productExceptSelf_BruteForce(nums);
        System.out.println("Brute-Force Method : ".concat(Arrays.toString(result_bruteForce)));
        int[] result_LinearTime = product.productExceptSelf_LinearTime(nums);
        System.out.println("Linear Time Method : ".concat(Arrays.toString(result_LinearTime)));
    }

    private int[] productExceptSelf_LinearTime(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int[] leftProducts = new int[length];
        leftProducts[0] = 1;
        int[] rightProducts = new int[length];
        rightProducts[length - 1] = 1;

        for(int i=1; i< length;i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        for(int i=length-2; i >=0; i--) {
            rightProducts[i] = rightProducts[i+1] * nums[i+1];
        }

        for(int i=0; i< length;i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }
        return result;
    }

    public int[] productExceptSelf_BruteForce(int[] nums) {
        int count = 0;
        int[] result = new int[nums.length];
        int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (count != j) {
                    temp = temp * nums[j];
                }
            }
            result[i] = temp;
            temp = 1;
            count += 1;
        }
        return result;
    }
}

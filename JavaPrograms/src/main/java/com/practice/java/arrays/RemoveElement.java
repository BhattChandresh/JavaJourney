/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * <p>
 * Custom Judge:
 * The judge will test your solution with the following code:
 * int[] nums = [...]; // Input array
 * int val = ...; // Value to remove
 * int[] expectedNums = [...]; // The expected answer with correct length.
 * // It is sorted with no values equaling val.
 * int k = removeElement(nums, val); // Calls your implementation
 * assert k == expectedNums.length;
 * sort(nums, 0, k); // Sort the first k elements of nums
 * for (int i = 0; i < actualLength; i++) {
 * assert nums[i] == expectedNums[i];
 * }
 * If all assertions pass, then your solution will be accepted.
 * <p>
 * Example 1:
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * Example 2:
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * <p>
 * Constraints:
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 50
 * 0 <= val <= 100
 */

package main.java.com.practice.java.arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
//        int[] nums = {3,2,2,3};
//        int val = 3;
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        RemoveElement removeElement = new RemoveElement();
        int result = removeElement.removeElement(nums, val);
        System.out.println("Result is : " + result);
    }

    public int removeElement(int[] nums, int val) {
        int arrLength = nums.length;
        int count = 0;
        int leftPtr = 0;
        int rightPtr;
        boolean isSwap = false;

        for (int i = 0; i < arrLength; i++) {
            if (nums[i] == val) {
                nums[i] = -1;
                count += 1;
            }
        }

        for (int i = 0; i < arrLength; i++) {
            if (!isSwap) {
                if (nums[i] == -1) {
                    leftPtr = i;
                    isSwap = true;
                }
            }
            if (isSwap) {
                if (nums[i] != -1) {
                    rightPtr = i;
                    swapElement(nums, leftPtr, rightPtr);
                    i = leftPtr;
                    isSwap = false;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return (arrLength - count);
    }

    void swapElement(int[] nums, int leftPtr, int rightPtr) {
        int temp = nums[leftPtr];
        nums[leftPtr] = nums[rightPtr];
        nums[rightPtr] = temp;
    }
}

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 * <p>
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 * <p>
 * Constraints:
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */


package main.java.com.practice.java.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {

        //int[] nums = {1,2,3,1};
        //int[] nums = {1,2,3,4};
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        boolean isContainDuplicate = containsDuplicate.containsDuplicate(nums);
        if (!isContainDuplicate) {
            System.out.println("Given Array Do not Contains Duplicate ");
        } else {
            System.out.println("Given Array Contains Duplicate");
        }
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(105);

        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}

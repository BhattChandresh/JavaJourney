/**
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 * <p>
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 * <p>
 * Constraints:
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * 0 <= k <= 105
 */

package main.java.com.practice.java.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public static void main(String[] args) {

        //int[] nums = {1,2,3,1};
        //int k = 3;

        //int[] nums = {1,0,1,1};
        //int k = 1;

        //int[] nums = {1,2,3,1,2,3};
        //int k = 2;

        int[] nums = {0, 1, 2, 3, 4, 0, 0, 7, 8, 9, 10, 11, 12, 0};
        int k = 1;

        ContainsDuplicate2 duplicate = new ContainsDuplicate2();

        boolean isContainDuplicate = duplicate.containsNearbyDuplicate(nums, k);
        if (isContainDuplicate) {
            System.out.print("Given Array satisfied the condition");
        } else {
            System.out.println("Given Array do not satisfied the condition");
        }
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean isOk = false;

        for (int t = 0; t < nums.length; t++) {
            if (!map.containsKey(nums[t])) {
                map.put(nums[t], t);
            } else {
                if (Math.abs(t - map.get(nums[t])) <= k) {
                    isOk = true;
                    break;
                } else {
                    isOk = false;
                }
                map.put(nums[t], t);
            }
        }
        return isOk;
    }
}

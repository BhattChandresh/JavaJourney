/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.

 * Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2

 * Example 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1

 * Example 3:
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4

 * Constraints:
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 */

package main.java.com.practice.java.arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {

        //int[] nums = {1,3,5,6};
        //int target = 5;

        //int[] nums = {1,3,5,6};
        //int target = 2;

        int[] nums = {1,3,5,6};
        int target = 7;


        SearchInsertPosition insertPosition = new SearchInsertPosition();
        int index = insertPosition.searchInsert(nums, target);
        System.out.println("Target position or predicitve position is : " + index);
    }

    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int start = 0;
        int end = length;

        while (start < end) {
            int middle = (start + end) / 2;

            if (target == nums[middle]) {
                return middle;
            }

            if (target > nums[middle]) {
                start = middle + 1;
            }

            if (target < nums[middle]) {
                end = middle - 1;
            }
        }
        return -1;
    }
}

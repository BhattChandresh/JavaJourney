/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * <p>
 * Example 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * <p>
 * Example 3:
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * <p>
 * Constraints:
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 */

package main.java.com.practice.java.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchInsertPosition {
    public static void main(String[] args) {

        //int[] nums = {1,3,5,6};
        //int target = 5;

        //int[] nums = {1,3,5,6};
        //int target = 2;

        //int[] nums = {1, 3, 5, 6};
        //int target = 7;

        int[] nums = {1,3};
        int target = 1;


        SearchInsertPosition insertPosition = new SearchInsertPosition();
        int index = insertPosition.searchInsert(nums, target);
        System.out.println("Target position or predicitve position is : " + index);
    }

    public int searchInsert(int[] nums, int target) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        if(!list.contains(target)) {
            list.add(target);
            Collections.sort(list);
        }
        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);


        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (target == arr[middle]) {
                return middle;
            }

            if (target > arr[middle]) {
                start = middle + 1;
            }

            if (target < arr[middle]) {
                end = middle - 1;
            }
        }
        return -1;
    }
}

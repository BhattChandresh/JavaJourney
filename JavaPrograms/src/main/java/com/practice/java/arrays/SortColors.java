/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
 */
package com.practice.java.arrays;

import java.util.HashMap;
import java.util.Map;

public class SortColors {
    public static void main(String[] args) {
        int[] colorArr = {0};
        SortColors sortColors = new SortColors();
        sortColors.sortRGBWithMap(colorArr);
    }

    protected int[] sortRGBWithMap(int[] colorArr) {
        Map<Integer, Integer> sortColorsMap = new HashMap<>();
        for (int i : colorArr) {
            if (sortColorsMap.containsKey(i)) {
                int value = sortColorsMap.get(i);
                sortColorsMap.put(i, value + 1);
            } else {
                sortColorsMap.put(i, 1);
            }
        }
        int position = 0;
        int count;
        for (int index = 0; index < 3; index++) {
            count = 0;
            if (sortColorsMap.get(index) != null) {
                int value = sortColorsMap.get(index);
                while (count < value) {
                    colorArr[position] = index;
                    position += 1;
                    count += 1;
                }
            }
        }
        return colorArr;
    }
}

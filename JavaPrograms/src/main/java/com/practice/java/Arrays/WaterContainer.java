/*
You are given an array of positive integers where each integer represents the height of vertical line on a chart.
Find two lines which together with x axis forms a container that would hold the greatest amount of water.
Return the area of water it would hold.

Constraints:
[1] Does the thickness of the lines affect the area ? No
[2] Do the left and right sides of the graph count as walls? No
[3] Does a higher line inside our container affect our area ? No

area = Length * Width

Test Cases:
[7,1,2,3,9] => Area = 7 (L) * (4-0) = 28
[] => Area = 0
[3] => Area = 0
[6,9,2,4,5,8] => 1) Area = 6 * 5-0 = 30
                                   2) Area = 8 * 5-1 = 32
 */
package com.practice.java.Arrays;

public class WaterContainer {
    public static void main(String[] args) {
        int[] arr = {7, 1, 2, 3, 9};
        WaterContainer wc = new WaterContainer();
        int area = wc.getMaxWaterContainerBruteForce(arr);
        System.out.println("Maximum Area is = " + area);
    }

    int getMaxWaterContainerBruteForce(int[] arr) {
        int maxArea = 0;
        int area;
        int length;
        int width;

        if (arr.length <= 1) {
            System.out.println("Given array of vertical height is not suffice to find the area");
            return 0;
        }

        for (int index = 0; index < arr.length - 1; index++) {
            for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
                length = Math.min(arr[index], arr[innerIndex]);
                width = innerIndex - index;
                area = length * width;
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }
}

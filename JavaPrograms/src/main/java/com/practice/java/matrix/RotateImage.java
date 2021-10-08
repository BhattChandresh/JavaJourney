/*
LeetCode Result:
Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Image.
Memory Usage: 39.2 MB, less than 47.67% of Java online submissions for Rotate Image.

Problem: 48
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 DO NOT allocate another 2D matrix and do the rotation.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Example 2:
Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

Example 3:
Input: matrix = [[1]]
Output: [[1]]

Example 4:
Input: matrix = [[1,2],[3,4]]
Output: [[3,1],[4,2]]


 */

package com.practice.java.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateImage {
    public static void main(String[] args) {
        int[][] image = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        RotateImage rotateImage = new RotateImage();
        int[][] result = rotateImage.rotateImageBy90Degree(image);
        for (int index = 0; index < result.length; index++) {
            System.out.println(Arrays.toString(image[index]));
        }
    }

    protected int[][] rotateImageBy90Degree(int[][] image) {
        List<Integer> matrixItemList = new ArrayList<>();
        int imageLength = image.length;

        for (int[] ints : image) {
            for (int col = 0; col < imageLength; col++) {
                matrixItemList.add(ints[col]);
            }
        }
        int listLength = matrixItemList.size();
        for (int row = 0; row < imageLength; row++) {
            for (int col = 0; col < imageLength; col++) {
                int factor = (imageLength * (col + 1));
                image[row][col] = matrixItemList.get(listLength - factor + row);
            }
        }
        return image;
    }
}

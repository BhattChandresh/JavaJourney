/*
Given an n x n matrix and a number x, find the position of x in the matrix if it is present in it. Otherwise, print “Not Found”.
 In the given matrix, every row and column is sorted in increasing order. The designed algorithm should have linear time complexity.
 */
package com.practice.java.arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] input = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};

        SearchInSortedMatrix searchInSortedMatrix = new SearchInSortedMatrix();
        int maxColumns = input[0].length;
        int elementToBeSearch = 10;
        String result = searchInSortedMatrix.search(input, maxColumns, elementToBeSearch);
        System.out.println(result);
    }

    protected String search(int[][] input, int maxColumns, int elementToBeSearch) {
        int row = 0;
        int column = maxColumns-1;

        while(row < maxColumns && column >=0) {
            if(input[row][column] == elementToBeSearch) {
                return String.join(",", Integer.toString(row), Integer.toString(column));
            }

            if(elementToBeSearch < input[row][column]) {
                column--;  //Eliminate column
            } else {
                row++;  //Eliminate row
            }
        }
        return "No Element Found";
    }
}

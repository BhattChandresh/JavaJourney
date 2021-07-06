/*
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 */
package com.practice.java.interviewcoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RowOfPascalTriangle {
    public static void main(String[] args) {
        RowOfPascalTriangle rowOfPascalTriangle = new RowOfPascalTriangle();
        Scanner sc = new Scanner(System.in);
        int rowNo = sc.nextInt();
        sc.close();
        List<Integer> list = rowOfPascalTriangle.getRowOfPascalTriangle(rowNo);
        System.out.println(list);
    }

    protected List<Integer> getRowOfPascalTriangle(int rowNo) {
        List<List<Integer>> allRows = new ArrayList<>();

        if (rowNo < 0) {
            return null;
        }

        for (int outerIndex = -1; outerIndex < rowNo; outerIndex++) {
            List<Integer> row = new ArrayList<>();
            if (outerIndex == -1) {
                row.add(outerIndex + 2);
            } else if (outerIndex == 0) {
                row.add(outerIndex + 1);
                row.add(outerIndex + 1);
            } else {
                List<Integer> previousRows = allRows.get(outerIndex);
                row.add(previousRows.get(0));
                for (int innerIndex = 0; innerIndex < previousRows.size() - 1; innerIndex++) {
                    row.add(previousRows.get(innerIndex) + previousRows.get(innerIndex + 1));
                }
                row.add(previousRows.get(previousRows.size() - 1));
            }
            allRows.add(row);
        }
        return allRows.get(rowNo);
    }
}

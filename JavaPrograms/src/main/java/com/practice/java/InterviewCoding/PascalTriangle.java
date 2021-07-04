package com.practice.java.InterviewCoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        sc.close();
        pascalTriangle.preparePascalTriangle(numRows);
    }

    protected List<List<Integer>> preparePascalTriangle(int numRows) {
        List<List<Integer>> pascalTriangleRowList = new ArrayList<>();

        for (int outerIndex = 0; outerIndex < numRows; outerIndex++) {
            List<Integer> rows = new ArrayList<>();
            if (outerIndex == 0) {
                rows.add(outerIndex + 1);
            } else if (outerIndex == 1) {
                rows.add(outerIndex);
                rows.add(outerIndex);
            } else {
                List<Integer> previousItemList = pascalTriangleRowList.get(outerIndex - 1);
                rows.add(previousItemList.get(0));
                for (int innerIndex = 0; innerIndex < previousItemList.size() - 1; innerIndex++) {
                    rows.add(previousItemList.get(innerIndex) + previousItemList.get(innerIndex + 1));
                }
                rows.add(previousItemList.get(previousItemList.size() - 1));
            }
            pascalTriangleRowList.add(rows);
        }
        //Used only for printing on console.
        for (int index = 0; index < pascalTriangleRowList.size(); index++) {
            System.out.println((index + 1) + " : " + pascalTriangleRowList.get(index));
        }
        return pascalTriangleRowList;
    }
}

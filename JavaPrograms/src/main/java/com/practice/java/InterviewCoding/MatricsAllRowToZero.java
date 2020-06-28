package com.practice.java.InterviewCoding;

import com.practice.java.Author;

@Author("Chandresh Bhatt")
public class MatricsAllRowToZero {
  //    static int[][] matrics = {
//            {12, 0, 34, 45, 89, 8},
//            {1, 23, 56, 78, 9, 1},
//            {23, 1, 8, 0, 76, 3},
//            {45, 0, 78, 24, 56, 81},
//            {65, 11, 34, 65, 7, 98}
//    };

    static int[][] matrics = {
            {1,1,0,1,1},
            {1,1,1,1,1},
            {1,1,0,1,1},
            {1,1,1,1,1},
            {0,1,1,1,1}
    };

    public static void main(String[] args) {
        printTheMatrics(matrics);
        makeAllRowValZero(matrics);
    }

    static void printTheMatrics(int[][] matrics) {
        for(int row=0; row < matrics.length;row++) {
            System.out.println();
            for(int col=0;col < matrics.length;col++) {
                System.out.print(matrics[row][col] + " ");
            }
        }
    }

    static void makeAllRowValZero(int[][] matrics) {
        for (int row = 0; row < matrics.length; row++) {
           for (int col = 0; col < matrics.length; col++) {
                if (matrics[row][col] == 0) {
                    convertToZero(row, matrics.length);
                }
            }
        }
        System.out.println();
        System.out.println("Result is : ");
        for(int row=0;row < matrics.length;row++) {
            System.out.println();
            for(int col=0;col < matrics.length;col++) {
                System.out.print(matrics[row][col] + " ");
            }
        }
    }

    static void convertToZero(int row, int len) {
        int col = 0;
        while (len > 0) {
            matrics[row][col] = 0;
            col = col + 1;
            len = len - 1;
        }
    }
}


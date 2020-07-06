package com.practice.java.InterviewCoding;

import com.practice.java.Author;

import java.util.ArrayList;
import java.util.List;

@Author("Chandresh Bhatt")
public class MatricsRowColToZero {
//      static int[][] matrics = {
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

    static List<Integer> list = new ArrayList<Integer>();

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
                    if(!(list.contains(col)))
                        list.add(col);
                    convertRowValueToZero(row, matrics.length);
                 break;
                }
            }
        }
        System.out.println();
        System.out.println("Columns which has 0 element = " + list);
        convertColValueToZero(list);
        System.out.println();
        publishFinalResult();
    }

    static void convertRowValueToZero(int row, int len) {
        int col = 0;
        while (len > 0) {
            matrics[row][col] = 0;
            col = col + 1;
            len = len - 1;
        }
    }

    static void convertColValueToZero(List list) {
        for(int row=0;row < matrics.length;row++) {
            for(int col=0; col < list.size();col++) {
                matrics[row][(int) list.get(col)] = 0;
            }
        }
    }

    static void publishFinalResult() {
        System.out.println("Result is : ");
        for(int row=0;row < matrics.length;row++) {
            System.out.println();
            for(int col=0;col < matrics.length;col++) {
                System.out.print(matrics[row][col] + " ");
            }
        }
    }
}


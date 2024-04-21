package main.java.com.practice.java.arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintPairsForSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int sum = 6;
//        int[] arr = {5, 3, 2, 8, 9, 1, 7};
//        int sum = 10;
//        int[] arr = {2, 3, 4, -2, 6, 8, 3, 3};
//        int sum = 6;
        PrintPairsForSum pairs = new PrintPairsForSum();
        pairs.printPairs_BruteForce(arr, sum);
        System.out.println("-------------------------------------------------------");
        pairs.printPairs_LinearTime(arr, sum);
    }

    void printPairs_LinearTime(int[] arr, int sum) {
        List<Integer> list = new ArrayList<>();
        for (Integer i : arr) {
            list.add(i);
        }

        int number = 0;
        Set<Integer> result = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            number = sum - arr[i];
            if (list.contains(number) && list.indexOf(number) != i) {
                boolean is_add = result.add(arr[i]);
                result.add(number);
                if (is_add) {
                    System.out.println("Linear Time : " + "(" + arr[i] + "," + number + ")");
                }
            }
        }
    }

    void printPairs_BruteForce(int[] arr, int sum) {
        Set<Integer> result = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    boolean is_add = result.add(arr[i]);
                    result.add(arr[j]);
                    if (is_add) {
                        System.out.println("Brute-Force : " + "(" + arr[i] + "," + arr[j] + ")");
                    }
                }
            }
        }
    }
}

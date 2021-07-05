package com.practice.java.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        //int[] inputArr = {2, 2, 1};
        //int[] inputArr = {4, 1, 2, 1, 2};
        int[] inputArr = {1};
        int number = singleNumber.getSingleNumber(inputArr);
        System.out.println(number);
    }

    protected int getSingleNumber(int[] inputArr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : inputArr) {
            if (!(map.containsKey(i))) {
                map.put(i, 1);
            } else {
                int value = map.get(i);
                map.put(i, value + 1);
            }
        }

        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            if (set.getValue() == 1) {
                return set.getKey();
            }
        }
        return -1;
    }
}

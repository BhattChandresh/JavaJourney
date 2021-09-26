package com.practice.java.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] inputArr = {1};
        int number = singleNumber.getSingleNumber(inputArr);
        System.out.println(number);
    }

    protected int getSingleNumber(int[] inputArr) {
        Map<Integer, Integer> countElementMap = new HashMap<>();

        Arrays.stream(inputArr).forEach((element) -> {
            if (!(countElementMap.containsKey(element))) {
                countElementMap.put(element, 1);
            } else {
                countElementMap.remove(element);
            }
        });
        return countElementMap.keySet().stream().findAny().orElse(-1);
    }
}

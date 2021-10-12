package com.practice.java.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] inputArr = {2, 2, 1, 1, 1, 2, 2};
        MajorityElement majorityElement = new MajorityElement();
        int element = majorityElement.getMajorityElementTraditionalApproach(inputArr);
        System.out.println("Majority Element = " + element);
    }

    protected int getMajorityElementTraditionalApproach(int[] inputArr) {
        Map<Integer, Integer> map = new HashMap<>();
        final int[] majorityElement = {0};

        for (int number : inputArr) {
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }

        map.forEach((k, v) -> {
            if (v > inputArr.length / 2) {
                majorityElement[0] = k;
            }
        });
        return majorityElement[0];
    }
}

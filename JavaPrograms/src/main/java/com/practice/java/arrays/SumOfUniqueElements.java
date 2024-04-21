/*
You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
Return the sum of all the unique elements of nums.

Input: nums = [1,2,3,2]
Output: 4 (Unique elements are 1 and 3)

Input: nums = [1,1,1,1,1]
Output: 0 (No unique elements)

1 <= nums.length <= 100
1 <= nums[i] <= 100
 */
package main.java.com.practice.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] inputArr = {1, 2, 3, 2};
        SumOfUniqueElements sumOfUniqueElements = new SumOfUniqueElements();
        int sumByMap = sumOfUniqueElements.getSumOfUniqueElementsByMap(inputArr);
        System.out.println("Sum By Map : " + sumByMap);
        int sumBySet = sumOfUniqueElements.getSumOfUniqueElementsBySet(inputArr);
        System.out.println("Sum by Set : " + sumBySet);
    }

    protected int getSumOfUniqueElementsBySet(int[] inputArr) {
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicateList = new ArrayList<>();

        for (int i : inputArr) {
            if (!set.add(i)) {
                duplicateList.add(i);
            }
        }

        for (int number : duplicateList) {
            set.remove(number);
        }
        return set.stream().reduce(0, Integer::sum);
    }

    protected int getSumOfUniqueElementsByMap(int[] inputArr) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(inputArr).forEach((number) -> {
            if (!(map.containsKey(number))) {
                map.put(number, 1);
            } else {
                map.put(number, map.get(number) + 1);
            }
        });
        List<Integer> list = map.entrySet().stream()
                .filter(value -> value.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        return list.stream().reduce(0, Integer::sum);
    }
}

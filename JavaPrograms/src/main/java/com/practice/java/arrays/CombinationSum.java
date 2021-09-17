/*
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
The same number may be chosen from candidates an unlimited number of times.
Two combinations are unique if the frequency of at least one of the chosen numbers is different.
It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
Example:
Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
Constraints:
1 <= candidates.length <= 30
1 <= candidates[i] <= 200
All elements of candidates are distinct.
1 <= target <= 500

 */
package com.practice.java.arrays;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        int[] candidate = {2, 3, 5};
        int target = 8;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        result = combinationSum.getCombinationSum(candidate, target, 0, list, result);
        System.out.println(result);
    }

    protected List<List<Integer>> getCombinationSum(int[] candidate, int target, int start, List<Integer> list, List<List<Integer>> combinations) {
        if (target < 0) {
            return null;
        }

        if (target == 0) {
            combinations.add(new ArrayList<>(list));
        }

        for (int index = start; index< candidate.length;index++) {
            list.add(candidate[index]);
            getCombinationSum(candidate, target - candidate[index], index, list, combinations);
            list.remove(list.size() - 1);
        }
        return combinations;
    }
}

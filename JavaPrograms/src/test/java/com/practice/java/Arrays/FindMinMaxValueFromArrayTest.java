package com.practice.java.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FindMinMaxValueFromArrayTest {

    private int[] testArr;
    private int[] result;
    static int count = 0;

    FindMinMaxValueFromArray min_max_val = new FindMinMaxValueFromArray();

    public FindMinMaxValueFromArrayTest(int[] testArr) {
        this.testArr = testArr;
        count = count + 1;
    }

    @Parameterized.Parameters
    public static int[][] input() {
        int[][] data = {{25, 14, 56, 15, 36, 56, 77, 18, 29, 49}, {3, 11, 21, 29, 41, 54, 61, 78, 110, 127}, {-2, 3, -9, 1235, 0, 6, 2, -12, -99, 33, 8888}};
        return data;
    }

    @Test
    public void test_getMinAndMaxValueByBruteForceAlgo() {
        result = min_max_val.getMinAndMaxValueByBruteForceAlgo(testArr);
        if (count == 1) {
            assertEquals(14, result[0]);
            assertEquals(77, result[1]);
        }
        if (count == 2) {
            assertEquals(3, result[0]);
            assertEquals(127, result[1]);
        }
        if (count == 3) {
            assertEquals(-99, result[0]);
            assertEquals(8888, result[1]);
        }
    }
}
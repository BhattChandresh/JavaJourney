package com.practice.java.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductOfArrayExceptSelfTest {

    private ProductOfArrayExceptSelf productOfArrayExceptSelf;

    @BeforeEach
    public void init() {
        productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
    }

    @Test
    void testGetProductOfArrExceptSelfNotLinearTime() {
        String str1 = "[0, 0, 9, 0, 0]";
        int[] result1 = productOfArrayExceptSelf.getProductOfArrExceptSelfNotLinearTime(new int[]{-1, 1, 0, -3, 3});
        assertEquals(str1, Arrays.toString(result1));

        String str2 = "[24, 12, 8, 6]";
        int[] result2 = productOfArrayExceptSelf.getProductOfArrExceptSelfNotLinearTime(new int[]{1, 2, 3, 4});
        assertEquals(str2, Arrays.toString(result2));

        String str3 = "[60, 40, 30, 24]";
        int[] result3 = productOfArrayExceptSelf.getProductOfArrExceptSelfNotLinearTime(new int[]{2, 3, 4, 5});
        assertEquals(str3, Arrays.toString(result3));
    }

    @Test
    void testGetProductOfArrExceptSelfUsingRecursion() {
        String str1 = "[0, 0, 9, 0, 0]";
        int[] result1 = productOfArrayExceptSelf.getProductOfArrExceptSelfUsingRecursion(new int[]{-1, 1, 0, -3, 3}, 0);
        assertEquals(str1, Arrays.toString(result1));

        String str2 = "[24, 12, 8, 6]";
        int[] result2 = productOfArrayExceptSelf.getProductOfArrExceptSelfUsingRecursion(new int[]{1, 2, 3, 4}, 0);
        assertEquals(str2, Arrays.toString(result2));

        String str3 = "[60, 40, 30, 24]";
        int[] result3 = productOfArrayExceptSelf.getProductOfArrExceptSelfNotLinearTime(new int[]{2, 3, 4, 5});
        assertEquals(str3, Arrays.toString(result3));
    }
}
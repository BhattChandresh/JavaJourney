package com.practice.java.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxValueTest {
    int [] testArr1 = {25,14,56,15,36,56,77,18,29,49};
    int[] testArr2 = {3, 11, 21, 29, 41, 54, 61, 78, 110, 127};
    int[] testArr3 = {-2,3,-9,1235,0,6,2,-12,-99,33,8888};

    @Test
    void getMinMaxValue() {
        MinMaxValue.get_MinAndMaxValue_bruteForceAlgo(testArr1);
        MinMaxValue.getMinMaxValue_ArrSort(testArr1);
    }
}
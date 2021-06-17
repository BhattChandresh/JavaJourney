package com.practice.java.mypractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FindPrimeNumbersTest {

    private FindPrimeNumbers findPrimeNumbers;

    @BeforeEach
    public void init() {
        findPrimeNumbers = new FindPrimeNumbers();
    }

    @Test
    void testFindPrimeNumbersInRange() {
        List<Integer> primeNumbersList = findPrimeNumbers.findPrimeNumbersInRange(100);
        assertEquals(new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)), primeNumbersList);
        primeNumbersList.clear();
        primeNumbersList = findPrimeNumbers.findPrimeNumbersInRange(1);
        assertTrue(primeNumbersList.isEmpty());
    }
}
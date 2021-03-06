package com.practice.java.mypractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMissingNumberTest {
    private FindMissingNumber findMissingNumber;

    @BeforeEach
    public void init() {
        findMissingNumber = new FindMissingNumber();
    }

    @Test
    void testGetMissingNumber() {
        assertEquals(findMissingNumber.getMissingNumber(new int[]{1, 2, 4, 6, 3, 7, 8}), 5);
        assertEquals(findMissingNumber.getMissingNumber(new int[]{1, 2, 3, 5}), 4);
        assertEquals(findMissingNumber.getMissingNumber(new int[]{1, 2, 3, 5, 4, 6, 8, 10, 9}), 7);
    }
}
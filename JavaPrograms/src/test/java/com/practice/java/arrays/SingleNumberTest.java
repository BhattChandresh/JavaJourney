package com.practice.java.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SingleNumberTest {
    SingleNumber singleNumber;

    @BeforeEach
    public void init() {
        singleNumber = new SingleNumber();
    }

    @Test
    void testGetSingleNumber() {
        assertEquals(4, singleNumber.getSingleNumber(new int[]{4, 1, 2, 1, 2}));
        assertEquals(1, singleNumber.getSingleNumber(new int[]{2, 2, 1}));
        assertEquals(1, singleNumber.getSingleNumber(new int[]{1}));
        assertEquals(99, singleNumber.getSingleNumber(new int[]{4, 7, 7, 4, 1, 2, 1, 2, 99}));
    }
}
package com.practice.java.mypractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountOneInNumberTest {
    private CountOneInNumber countOneInNumber;

    @BeforeEach
    void setUp() {
        countOneInNumber = new CountOneInNumber();
    }

    @Test
    void testcountOnes() {
        assertEquals(countOneInNumber.countOnes(5), 2);
        assertEquals(countOneInNumber.countOnes(14), 3);
        assertEquals(countOneInNumber.countOnes(0), 0);
    }
}
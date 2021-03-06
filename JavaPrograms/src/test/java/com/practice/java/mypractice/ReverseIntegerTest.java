package com.practice.java.mypractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {
    private ReverseInteger reverseInteger;

    @BeforeEach
    void setUp() {
        reverseInteger = new ReverseInteger();
    }

    @Test
    void testReverseMethod1() {
        assertEquals(reverseInteger.reverseMethod1(-27812), -21872);
        assertEquals(reverseInteger.reverseMethod1(76548), 84567);
    }
}
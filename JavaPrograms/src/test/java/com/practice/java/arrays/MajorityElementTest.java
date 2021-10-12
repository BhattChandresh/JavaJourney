package com.practice.java.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementTest {
    private MajorityElement majorityElement;

    @BeforeEach
    public void init() {
        majorityElement = new MajorityElement();
    }

    @Test
    void testGetMajorityElementTraditionalApproach() {
        assertEquals(3, majorityElement.getMajorityElementTraditionalApproach(new int[]{3, 2, 3}));
        assertEquals(2, majorityElement.getMajorityElementTraditionalApproach(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
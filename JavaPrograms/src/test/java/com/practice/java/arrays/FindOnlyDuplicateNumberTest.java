package com.practice.java.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FindOnlyDuplicateNumberTest {
    private FindOnlyDuplicateNumber duplicateNumber;

    @BeforeEach
    public void init() {
        duplicateNumber = new FindOnlyDuplicateNumber();
    }

    @Test
    void testFindOnlyDuplicateNumberBySet() {
        assertEquals(2, duplicateNumber.findOnlyDuplicateNumberBySet(new int[]{1, 3, 4, 2, 2}));
        assertEquals(3, duplicateNumber.findOnlyDuplicateNumberBySet(new int[]{3, 1, 3, 4, 2}));
        assertEquals(1, duplicateNumber.findOnlyDuplicateNumberBySet(new int[]{1, 1}));
        assertEquals(1, duplicateNumber.findOnlyDuplicateNumberBySet(new int[]{1, 1, 2}));
        assertEquals(10, duplicateNumber.findOnlyDuplicateNumberBySet(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 10}));
    }

    @Test
    void testFindOnlyDuplicateNumber() {
        assertEquals(2, duplicateNumber.findOnlyDuplicateNumber(new int[]{1, 3, 4, 2, 2}));
        assertEquals(3, duplicateNumber.findOnlyDuplicateNumber(new int[]{3, 1, 3, 4, 2}));
        assertEquals(1, duplicateNumber.findOnlyDuplicateNumber(new int[]{1, 1}));
        assertEquals(1, duplicateNumber.findOnlyDuplicateNumber(new int[]{1, 1, 2}));
        assertEquals(10, duplicateNumber.findOnlyDuplicateNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 10}));
    }
}
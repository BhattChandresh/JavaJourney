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
    }
}
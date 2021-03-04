package com.practice.java.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicateFromArrTest {
    private RemoveDuplicateFromArr removeDuplicateFromArr;
    private Set<Integer> set1;
    private Set<Integer> set2;
    private Set<Integer> set3;
    private Set<Integer> set4;

    @BeforeEach
    public void init() {
        removeDuplicateFromArr = new RemoveDuplicateFromArr();
        set1 = new LinkedHashSet<>();
        set2 = new LinkedHashSet<>();
        set3 = new LinkedHashSet<>();
        set4 = new LinkedHashSet<>();

        set1.add(4);
        set1.add(3);
        set1.add(2);
        set1.add(9);

        set2.add(1);
        set2.add(2);

        set3.add(15);
        set3.add(21);
        set3.add(11);
        set3.add(51);

        set4.add(7);
        set4.add(3);
        set4.add(21);
        set4.add(34);
        set4.add(18);
    }

    @Test
    void testRemoveDuplicateElements() {
        assertEquals(removeDuplicateFromArr.removeDuplicateElements(new int[]{4, 3, 2, 4, 9, 2}), set1);
        assertEquals(removeDuplicateFromArr.removeDuplicateElements(new int[]{1, 2, 1, 2, 1, 2}), set2);
        assertEquals(removeDuplicateFromArr.removeDuplicateElements(new int[]{15, 21, 11, 21, 51, 21, 11}), set3);
        assertEquals(removeDuplicateFromArr.removeDuplicateElements(new int[]{7, 3, 21, 7, 34, 18, 3, 21}), set4);
    }
}
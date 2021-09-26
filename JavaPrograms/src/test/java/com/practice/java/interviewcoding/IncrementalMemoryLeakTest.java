package com.practice.java.interviewcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IncrementalMemoryLeakTest {

    private IncrementalMemoryLeak incrementalMemoryLeak;

    @BeforeEach
    public void init() {
        incrementalMemoryLeak = new IncrementalMemoryLeak();
    }

    @Test
    void testFindCrashPoint() {
        assertEquals(Arrays.toString(new int[]{3, 1, 0}), Arrays.toString(incrementalMemoryLeak.findCrashPoint(2, 2)));
        assertEquals(Arrays.toString(new int[]{6, 0, 4}), Arrays.toString(incrementalMemoryLeak.findCrashPoint(8, 11)));
        assertEquals(Arrays.toString(new int[]{8, 0, 5}), Arrays.toString(incrementalMemoryLeak.findCrashPoint(15, 18)));
    }
}
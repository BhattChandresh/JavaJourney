package com.practice.java.interviewcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class RobotReturnToOriginTest {
    private RobotReturnToOrigin returnToOrigin;

    @BeforeEach
    public void init() {
        returnToOrigin = new RobotReturnToOrigin();
    }

    @Test
    void testRobotMovementToOriginal() {
        assertTrue(returnToOrigin.robotMovementToOriginal("RLDU"));
        assertFalse(returnToOrigin.robotMovementToOriginal("RRDD"));
        assertTrue(returnToOrigin.robotMovementToOriginal("DU"));
        assertFalse(returnToOrigin.robotMovementToOriginal("LDRRLRUULR"));
        assertFalse(returnToOrigin.robotMovementToOriginal("LL"));
        assertTrue(returnToOrigin.robotMovementToOriginal("UURLDDLLRR"));
    }
}
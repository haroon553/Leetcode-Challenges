package org.example.climbingStairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class climbingStairsTest {

    @Test
    void testExample1() {
        climbingStairs climbingStairs = new climbingStairs();
        int steps = 2;
        assertEquals(2,climbingStairs.climbStairs(steps));

    }

    @Test
    void testExample2() {
        climbingStairs climbingStairs = new climbingStairs();
        int steps = 3;
        assertEquals(3,climbingStairs.climbStairs(steps));

    }
}
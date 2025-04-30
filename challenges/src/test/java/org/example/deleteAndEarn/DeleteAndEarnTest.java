package org.example.deleteAndEarn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteAndEarnTest {

    @Test
    void deleteAndEarnBruteForceExample() {
        DeleteAndEarn deleteAndEarn = new DeleteAndEarn();
        int[] nums = {3, 4, 2};
        assertEquals(6,deleteAndEarn.deleteAndEarnBruteForce(nums));

    }

    @Test
    void deleteAndEarnDpExample() {
        DeleteAndEarn deleteAndEarn = new DeleteAndEarn();
        int[] nums = {3, 4, 2};
        assertEquals(6,deleteAndEarn.deleteAndEarnDp(nums));
    }

    @Test
    void deleteAndEarnOptimisedExample() {
        DeleteAndEarn deleteAndEarn = new DeleteAndEarn();
        int[] nums = {3, 4, 2};
        assertEquals(6,deleteAndEarn.deleteAndEarnOptimised(nums));
    }
}
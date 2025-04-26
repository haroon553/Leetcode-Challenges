package org.example.houseRobber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    @Test
    void robHouseExample1() {
        HouseRobber houseRobber = new HouseRobber();
        int[] nums = {2, 7, 9, 3, 1};
        assertEquals(12,houseRobber.robHouse(nums));
    }

    @Test
    void robHouseExample2() {
        HouseRobber houseRobber = new HouseRobber();
        int[] nums = {1, 2, 3, 1};
        assertEquals(4,houseRobber.robHouse(nums));
    }

    @Test
    void robHouseBruteForceExample1() {
        HouseRobber houseRobber = new HouseRobber();
        int[] nums = {2, 7, 9, 3, 1};
        assertEquals(12,houseRobber.robHouseBruteForce(nums));
    }
}

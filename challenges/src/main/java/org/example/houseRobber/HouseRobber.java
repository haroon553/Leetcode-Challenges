package org.example.houseRobber;

public class HouseRobber {

    // Optimised solution
    public int robHouse(int [] nums){
            if(nums.length == 0) return 0; // base case with 0 house
            if(nums.length == 1) return nums[0]; // base case with 1 house
            int prv2 = nums[0]; // loot until i-2 house
            int prv1 = Math.max(nums[0],nums[1]); // loot until i-i house
            for(int i=2;i<nums.length;i++){
                int current = Math.max(prv1, prv2 + nums[i]);
                prv2 = prv1;
                prv1 = current;
            }
            return prv1;
    }



    // Brute force solution
    public int robHouseBruteForce(int [] nums){
        return robFrom(0, nums);
    }

    private int robFrom (int currentIndex, int [] nums){

        // if no house is left
        if(currentIndex >= nums.length) return 0;

        // Option1: Rob current house and move to current + 2
        int robCurrent = nums[currentIndex] + robFrom(currentIndex + 2, nums);

        // Option2: Skip current house and move to current + 1
        int skipCurrent = robFrom(currentIndex + 1, nums);

        // Return the maximum of both option

        return Math.max(robCurrent, skipCurrent);

    }

}

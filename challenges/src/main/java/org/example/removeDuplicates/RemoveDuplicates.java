package org.example.removeDuplicates;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        // base case handling
        if(nums.length == 0) return 0;

        int k = 1; // unique element position
        for (int i=1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) { // check for unique element
                nums[k] = nums[i];
                k++;
            }
        }

        return k;

    }


}

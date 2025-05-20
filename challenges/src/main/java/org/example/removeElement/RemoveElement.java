package org.example.removeElement;

public class RemoveElement {
    public int removeElement(int [] nums, int val){
        // pointer to place the valid elements
        int i = 0;
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i; // count of valid elements
    }
}

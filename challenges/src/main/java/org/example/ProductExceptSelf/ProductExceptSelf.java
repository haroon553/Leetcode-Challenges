package org.example.ProductExceptSelf;

public class ProductExceptSelf {
    public int [] productExceptSelf(int [] nums){
        int n = nums.length;
        if (n == 0 ) return nums;

        //Compute product from left to right
        int [] output = new int[n];
        output[0] = 1;
        for (int i = 1; i < n; i++ ) {
            output[i] = output[i-1] * nums[i-1];
        }

        // Compute product from right to left
        int suffix = 1;
        for (int i = n-1; i >= 0; i--){
            output[i] *= suffix;
            suffix *= nums[i];
        }

        return output;
    }
}

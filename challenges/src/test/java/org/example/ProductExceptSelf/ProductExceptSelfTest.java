package org.example.ProductExceptSelf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductExceptSelfTest {

    @Test
    void productExceptSelfExample() {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int [] nums = {1,2,3,4};
        int [] expected = {24,12,8,6};
        assertArrayEquals(expected,productExceptSelf.productExceptSelf(nums));
    }
}
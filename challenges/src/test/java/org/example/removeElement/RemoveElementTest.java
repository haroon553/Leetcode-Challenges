package org.example.removeElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void removeElementExample1() {
        RemoveElement removeElement = new RemoveElement();
        int [] nums = {3,2,2,3};
        int val = 3;
        assertEquals(2, removeElement.removeElement(nums,val));
    }
}
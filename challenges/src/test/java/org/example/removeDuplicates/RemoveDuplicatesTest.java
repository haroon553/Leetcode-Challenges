package org.example.removeDuplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicatesExample1() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int [] nums =  {0,0,1,1,1,2,2,3,3,4};
        assertEquals(5,removeDuplicates.removeDuplicates(nums));
    }

    @Test
    void removeDuplicatesExample2() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int [] nums =  {1,1,2};
        assertEquals(2,removeDuplicates.removeDuplicates(nums));
    }

}
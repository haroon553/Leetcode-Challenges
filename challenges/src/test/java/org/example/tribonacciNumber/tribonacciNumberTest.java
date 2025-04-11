package org.example.tribonacciNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tribonacciNumberTest {

    @Test
    void testExample1() {
        tribonacciNumber t = new tribonacciNumber();
        int n = 4;
        assertEquals(4,t.tribonacci(n));
    }

    @Test
    void testExample2() {
        tribonacciNumber t = new tribonacciNumber();
        int n = 25;
        assertEquals(1389537,t.tribonacci(n));
    }
}
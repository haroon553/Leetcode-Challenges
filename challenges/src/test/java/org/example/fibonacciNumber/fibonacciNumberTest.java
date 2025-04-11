package org.example.fibonacciNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fibonacciNumberTest {

    @Test
    void testExample1() {
        fibonacciNumber fibonacciNumber = new fibonacciNumber();
        int n = 2;
        assertEquals(1,fibonacciNumber.fib(n));
    }

    @Test
    void testExample2() {
        fibonacciNumber fibonacciNumber = new fibonacciNumber();
        int n = 4;
        assertEquals(3,fibonacciNumber.fib(n));
    }
}
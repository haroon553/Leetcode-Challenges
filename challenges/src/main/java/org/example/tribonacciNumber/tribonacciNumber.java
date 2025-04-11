package org.example.tribonacciNumber;

public class tribonacciNumber {
    public int tribonacci(int n) {
        //handle base cases
        if (n <= 1) return n;
        if (n <= 2) return 1;
        int thirdLast = 0;
        int secondLast = 1;
        int last = 1;
        for (int i=3; i <= n; i++ ) {
            int current = thirdLast + secondLast + last;
            thirdLast = secondLast;
            secondLast = last;
            last = current;
        }
        return last;


    }
}

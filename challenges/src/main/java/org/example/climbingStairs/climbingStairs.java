package org.example.climbingStairs;

public class climbingStairs {

    public int climbStairs(int n) {
        //base cases for n=1 and n=2
        if (n <= 2) return n;

        int prev1= 1; int prev2 = 2;
        for(int i=3; i <= n; i++ ) {
            int current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return prev2;


    }


}

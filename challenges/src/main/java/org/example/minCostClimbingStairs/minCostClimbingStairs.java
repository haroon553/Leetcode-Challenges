package org.example.minCostClimbingStairs;

public class minCostClimbingStairs {
    public int minCostBruteForce(int[] cost) {
        // Start from stair 0 or 1, choose the cheaper option
        return Math.min(helper(cost, 0), helper(cost, 1));
    }

    private int helper(int[] cost, int pos) {
        // Base case: Reached the top (no more cost)
        if (pos >= cost.length) {
            return 0;
        }
        // Recursive case: Pay cost[pos] + min(cost to reach pos+1 or pos+2)
        return cost[pos] + Math.min(helper(cost, pos + 1), helper(cost, pos + 2));
    }

    public int minCostOptimised(int [] cost) {
        int n = cost.length;
        // handle base cases
        if(n <= 1)
            return 0;
        // initialize the last two steps' cost
        int prev1 = cost[1];
        int prev2 = cost[0];

        for(int i=2; i<n; i++){
           int current = cost[i] + Math.min(prev1,prev2);
           //update for next iteration
            prev2 = prev1; // shifts left
            prev1 = current; // shifts left
        }

       return Math.min(prev1,prev2);

    }
}

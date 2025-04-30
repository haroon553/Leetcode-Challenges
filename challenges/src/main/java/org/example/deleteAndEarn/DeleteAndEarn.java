package org.example.deleteAndEarn;

import java.util.*;

public class DeleteAndEarn {

    public int deleteAndEarnOptimised(int [] nums){

        //base case handling
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        // calculate maxNum and points
        int maxNum = Arrays.stream(nums).max().getAsInt();
        int [] points = new int[maxNum +1];
        for(int num: nums) points[num] += num;

        // intitialize i-1 and i-2
        int prv2= 0;
        int prv1= points[1];
        for(int i=2; i<= maxNum; i++){
            // skip i-1 or take i-2 + current
            int current = Math.max(prv1,prv2 + points[i]);
            prv2 = prv1;
            prv1 = current;
        }
        return prv1;

    }



    public int deleteAndEarnDp(int [] nums){

        //base case handling
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        // calculate maxNum and points
        int maxNum = Arrays.stream(nums).max().getAsInt();
        int [] points = new int[maxNum +1];
        for(int num: nums) points[num] += num;

        // intitialize dp[]
        int [] dp = new int[maxNum + 1];
        dp[0]= 0;
        dp[1]= points[1];
        for(int i=2; i<= maxNum; i++){
            // skip i-1 or take i-2 + current
            dp[i] = Math.max(dp[i-1],dp[i-2] + points[i]);
        }
        return dp[maxNum];

    }

    public int deleteAndEarnBruteForce(int [] nums){
        // calculate frequencies
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // Sort the nums
        List<Integer> sortedNums = new ArrayList<>(count.keySet());
        Collections.sort(sortedNums);
        // For each number x, recursively:
        //Take x: Add x * count[x] to points, then skip x-1 and x+1.
        //Skip x: Move to the next number without earning points.

        // start the brute force recursion
        return backtrack(sortedNums,count,0);

    }

    private int backtrack(List<Integer> sortedNums, Map<Integer, Integer> count, int index) {
        if (index >= sortedNums.size()) return 0;

        int currentNum = sortedNums.get(index);
        int pointsIfTaken = currentNum * count.get(currentNum);

        // skip the adjacent numbers (x-1) and (x+1)
        int nextIndex = index + 1;
        while(nextIndex < sortedNums.size() && sortedNums.get(nextIndex) == currentNum +1){
            nextIndex++;
        }
        // choice 1 : take current num + skip adjacent
        int take = pointsIfTaken + backtrack(sortedNums,count,nextIndex);

        // choice 2 : skip current num
        int skip = backtrack(sortedNums,count,index+1);


        return Math.max(take,skip);

    }
}

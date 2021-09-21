/*
 * Climbing Stairs
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/
 * dynamic-programming/569/
 */

class Solution {
    public int climbStairs(int n) {
        if (n < 3)
            return n;

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}

// Another Approach

class Solution {
    public int climbStairs(int n) {
        int[] ways = new int[n + 1];
        Arrays.fill(ways, -1);

        return helper(n, ways);
    }

    public int helper(int n, int[] ways) {
        if (n < 3) {
            ways[n] = n;
            return ways[n];
        }

        if (ways[n] != -1)
            return ways[n];

        ways[n] = helper(n - 1, ways) + helper(n - 2, ways);

        return ways[n];
    }
}
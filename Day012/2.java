/*
 * Best Time to Buy and Sell Stock
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/
 * dynamic-programming/572/
 */

class Solution {
    public int maxProfit(int[] prices) {
        int minimal = Integer.MAX_VALUE;

        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            minimal = Math.min(minimal, prices[i]);

            profit = Math.max(profit, prices[i] - minimal);
        }

        return profit;
    }
}
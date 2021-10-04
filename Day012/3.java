/*
 * Maximum Subarray
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/
 * dynamic-programming/566/
 */

class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        int sum = 0;
        int max_so_far = nums[0];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum > max_so_far)
                max_so_far = sum;

            if (sum < 0)
                sum = 0;

        }

        return max_so_far;
    }
}
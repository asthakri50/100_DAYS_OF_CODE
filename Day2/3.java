/*
 * Find the Duplicate Number
 * https://leetcode.com/problems/find-the-duplicate-number/
 */

class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int repeat = -1;

        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i]) < n) {
                if (nums[Math.abs(nums[i])] < 0)
                    repeat = Math.abs(nums[i]);
                else
                    nums[Math.abs(nums[i])] = -1 * nums[Math.abs(nums[i])];
            }
        }

        if (repeat == -1)
            repeat = nums.length;

        return repeat;

    }
}
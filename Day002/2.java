/*
 * Missing Number https://leetcode.com/problems/missing-number/
 */

class Solution {
    public int missingNumber(int[] nums) {
        int res = -1;
        int flag = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (Math.abs(nums[i]) < n) {
                nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
                if (nums[Math.abs(nums[i])] == 0)
                    flag = 1; // multiplied by 1
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                res = i;
                break;
            }

            if (nums[i] == 0 && flag == 0) {
                res = i;
                break;
            }
        }

        if (res == -1)
            res = n;

        return res;
    }
}
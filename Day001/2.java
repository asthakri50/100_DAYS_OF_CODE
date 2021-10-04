/*
 * [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;

        int[] res = new int[2 * len];

        for (int i = 0; i < 2 * len; i++) {
            if (i < len)
                res[i] = nums[i];
            else
                res[i] = nums[i - len];
        }

        return res;
    }
}
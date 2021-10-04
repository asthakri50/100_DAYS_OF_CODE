/*
 * [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)
 */

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int p1 = 0;
        int p2 = n;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                res[i] = nums[p1];
                p1++;
            } else {
                res[i] = nums[p2];
                p2++;
            }
        }
        return res;
    }
}
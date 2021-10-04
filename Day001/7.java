/*
 * [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)
 */

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int num : nums) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);

        }

        int count = 0;

        for (int num : map.values())
            count += (num * (num - 1)) / 2;

        return count;
    }
}
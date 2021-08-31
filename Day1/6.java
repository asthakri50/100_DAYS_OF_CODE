/*
 * [Kids With the Greatest Number of
 * Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-
 * candies/)
 */

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> li = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++)
            max = Math.max(max, candies[i]);

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max)
                li.add(true);
            else
                li.add(false);
        }

        return li;
    }
}
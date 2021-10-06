/*
 * Find All Duplicates in an Array
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/ You must write
 * an algorithm that runs in O(n) time and uses only constant extra space.
 */

/// Approach1
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                res.add(nums[i]);
            }
        }

        return res;
    }
}

// Approach2
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        final List<Integer> duplicates = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            final int n = Math.abs(nums[i]);
            if (nums[n - 1] < 0) {
                duplicates.add(n);
            } else {
                nums[n - 1] *= -1;
            }
        }
        return duplicates;
    }
}
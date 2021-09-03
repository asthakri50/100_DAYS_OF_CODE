/*
 * Single Element in a Sorted Array
 * https://leetcode.com/problems/single-element-in-a-sorted-array/
 */

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int num = 0;

        for (int n : nums)
            num = num ^ n;

        return num;
    }

}

// Time Complexity:- O(n)

// Another Approach using Binary Search
// Time Complexity:- O(log n)
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int ans = -1;
        if (n == 1)
            return nums[0];

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid == n - 1)
                return nums[mid];

            if (mid == 0)
                return nums[mid];

            // found single element
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];

            // landed on second occurence
            if (nums[mid] == nums[mid - 1])
                mid = mid - 1;

            // In case of left array index of first occurrence is even
            // while in right array it is odd

            if (mid % 2 == 0) // move right
                start = mid + 2;
            else
                end = mid - 1;
        }

        return -1;
    }
}
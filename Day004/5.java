/*
 * Find Peak Element https://leetcode.com/problems/find-peak-element/
 */
class Solution {
    public int findPeakElement(int[] nums) {
        int idx = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                idx = i;
            }
        }

        return idx;
    }
}

// Time Complexity- O(logn)

// Another Approach
class Solution {
    public int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start < end) {
            mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
                end = mid;
            else
                start = mid + 1;

        }

        return start;
    }
}
/*
 * Search in Rotated Sorted Array
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 */

class Solution {
    public int search(int[] nums, int target) {

        if (nums.length == 0)
            return -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid])
                return mid;

            // target belongs to left array
            if (target >= nums[0]) {
                // we are in left array
                if (nums[mid] >= nums[0]) {
                    if (target > nums[mid])
                        start = mid + 1;
                    else
                        end = mid - 1;
                } else
                    end = mid - 1;
            }
            // target belongs to right array
            else {

                // we are in right array
                if (nums[mid] < nums[0]) {
                    if (target > nums[mid])
                        start = mid + 1;
                    else
                        end = mid - 1;
                } else
                    start = mid + 1;
            }

        }

        return -1;
    }
}

// Time Complexity- O(logn)
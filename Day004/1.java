/*
Search Insert Position
https://leetcode.com/problems/search-insert-position/
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int idx = -1;

        // Edge Cases
        if (target <= nums[0])
            return 0;

        if (target == nums[end])
            return end;

        if (target > nums[end])
            return end + 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] <= target) {

                if (nums[mid] == target)
                    return mid;

                idx = mid + 1;
                start = mid + 1;
            } else
                end = mid - 1;
        }

        return idx;
    }
}
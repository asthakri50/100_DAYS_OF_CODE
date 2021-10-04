/*
Merge Sorted Array
https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/587/
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = n + m - 1;

        if (n == 0)
            return;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p--;
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p--;
                p2--;
            }
        }

        while (p1 >= 0) {
            nums1[p] = nums1[p1];
            p1--;
            p--;
        }

        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p--;
            p2--;
        }

        return;
    }
}
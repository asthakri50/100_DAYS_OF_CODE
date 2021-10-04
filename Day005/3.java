/*
 * Next Greater Element I https://leetcode.com/problems/next-greater-element-i/
 */

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            int flag = 0;
            int idx = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == num) {
                    flag = 1;
                }

                if (flag == 1 && nums2[j] > num) {
                    idx = j;
                    break;
                }
            }
            if (idx != -1)
                res[i] = nums2[idx];
            else
                res[i] = -1;
        }

        return res;
    }
}
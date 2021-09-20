/*
 * First Bad Version
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/
 * sorting-and-searching/774/
 */

/* The isBadVersion API is defined in the parent class VersionControl.
     boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int count = 0;

        int low = 1;
        int high = n;

        while (low < high) {
            count++;
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid) == true)
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }
}
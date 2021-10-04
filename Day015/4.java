/*
 * Number of 1 Bits https://www.interviewbit.com/problems/number-of-1-bits/
 */

public class Solution {
    public int numSetBits(long a) {
        int count = 0;

        while (a > 0) {
            count += a & 1;
            a = a >> 1;
        }
        return count;
    }
}

/*
 * Reverse Integer
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/
 * strings/880/
 */

class Solution {
    public int reverse(int x) {
        long rev = 0;
        int original = x;

        if (x < 0)
            x = x * -1;

        if (x == 0)
            return 0;

        while (x > 0) {
            int r = x % 10;
            x = x / 10;
            rev = rev * 10 + r;
        }

        if (original < 0)
            rev = rev * -1;

        if (rev > 2147483647)
            return 0;

        if (rev < -2147483648)
            return 0;

        return (int) rev;

    }
}
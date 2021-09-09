/*
 * Valid Palindrome
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/
 * strings/883/
 */
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))
                sb.append(ch);
        }

        s = sb.toString();
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i))
                return false;
        }

        return true;
    }
}
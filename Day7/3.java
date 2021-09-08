/*
 * First Unique Character in a String
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/
 * strings/881/
 */

class Solution {
    public int firstUniqChar(String s) {
        HashSet<Character> set = new HashSet<>();

        int n = s.length();
        int[] alpha = new int[27];

        for (int i = 0; i < n; i++)
            alpha[s.charAt(i) - 'a']++;

        for (int i = 0; i < n; i++) {
            if (alpha[s.charAt(i) - 'a'] == 1)
                return i;
        }

        return -1;

    }
}
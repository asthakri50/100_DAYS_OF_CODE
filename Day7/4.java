/*
 * Valid Anagram
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/
 * strings/882/
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        if (len1 != len2)
            return false;

        int[] alpha = new int[27];

        for (int i = 0; i < len1; i++)
            alpha[s.charAt(i) - 'a']++;

        for (int i = 0; i < len2; i++)
            alpha[t.charAt(i) - 'a']--;

        for (int i = 0; i < 27; i++) {
            if (alpha[i] != 0)
                return false;
        }

        return true;
    }
}
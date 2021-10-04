/*
 * Longest Common Prefix
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/
 * strings/887/
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        String s = strs[0];
        int len = s.length();
        int idx = 0;

        if (strs.length == 1)
            return s;

        while (idx < len) {
            for (int i = 1; i < strs.length; i++) {
                String str = strs[i];
                if (idx < str.length()) {
                    if (str.charAt(idx) != s.charAt(idx))
                        return sb.toString();
                } else
                    return sb.toString();
            }
            sb.append(s.charAt(idx));
            idx++;
        }
        if (idx == len)
            return sb.toString();

        return "";
    }
}

// faster solution
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        while (c < first.length()) {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }
}

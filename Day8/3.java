/*
 * Count and Say
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/
 * strings/886/
 */

//This is recursive solution. Slower
class Solution {
    public String countAndSay(int n) {
        // Base Case
        if (n == 1)
            return "1";

        return count(n);
    }

    public String count(int n) {
        if (n == 1)
            return "1";

        String str = count(n - 1);

        StringBuffer sb = new StringBuffer();
        char s = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == s)
                count++;
            else {
                sb.append(count);
                sb.append(s);
                s = str.charAt(i);
                count = 1;
            }
        }

        sb.append(count);
        sb.append(s);

        return sb.toString();
    }
}

// This is iterative solution of same approach
public class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            s = countIdx(s);
        }
        return s;
    }

    public String countIdx(String s) {
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            } else {
                sb.append(count);
                sb.append(c);
                c = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
}
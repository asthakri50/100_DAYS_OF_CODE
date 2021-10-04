/*
String to Integer (atoi)
https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/884/
*/

class Solution {
    public int myAtoi(String s) {
        s = s.trim();

        int flag = 1;
        ArrayList<Character> num = new ArrayList<>();
        num.add('0');
        num.add('1');
        num.add('2');
        num.add('3');
        num.add('4');
        num.add('5');
        num.add('6');
        num.add('7');
        num.add('8');
        num.add('9');

        double ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                flag = flag * -1;
                continue;
            }
            if (i == 0 && s.charAt(i) == '+') {
                flag = flag * 1;
                continue;
            }

            if (num.contains(s.charAt(i))) {
                int idx = num.indexOf(s.charAt(i));
                ans = ans * 10 + idx;
            } else
                break;

        }

        ans = ans * flag;

        if (ans > 2147483647)
            ans = 2147483647;

        if (ans < -2147483648)
            ans = -2147483648;

        return (int) ans;
    }
}

// Faster solution
class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.isEmpty())
            return 0;
        int sign = 1;
        int i = 0;
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            sign = (str.charAt(0) == '-') ? -1 : 1;
            if (str.length() < 2 || !Character.isDigit(str.charAt(1))) {
                return 0;
            }
            i++;
        }
        int n = 0;
        while (i < str.length()) {
            if (Character.isDigit(str.charAt(i))) {
                int d = str.charAt(i) - '0';
                if (n > (Integer.MAX_VALUE - d) / 10) { // Detect the integer overflow.
                    n = (sign == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                    return n;
                }
                n = n * 10 + d;
            } else {
                break;
            }
            i++;
        }
        return sign * n;
    }
}
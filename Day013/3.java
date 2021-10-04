/*
 * Parenthesis Checker
 * https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1#
 */

class Solution {
    // Function to check if brackets are balanced or not.
    static boolean ispar(String s) {
        // add your code here
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stk.push(s.charAt(i));
            else {
                if (s.charAt(i) == ')') {
                    if (!stk.isEmpty() && stk.peek() == '(')
                        stk.pop();
                    else
                        return false;
                } else if (s.charAt(i) == '}') {
                    if (!stk.isEmpty() && stk.peek() == '{')
                        stk.pop();
                    else
                        return false;
                } else if (s.charAt(i) == ']') {
                    if (!stk.isEmpty() && stk.peek() == '[')
                        stk.pop();
                    else
                        return false;
                }
            }
        }

        if (stk.isEmpty())
            return true;

        return false;
    }
}

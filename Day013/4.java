/*
 * Reverse a string using Stack
 * https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1
 */

class Solution {

    public String reverse(String S) {
        // code here
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < S.length(); i++)
            stk.push(S.charAt(i));

        StringBuilder sb = new StringBuilder();

        while (!stk.isEmpty()) {
            sb.append(stk.peek());
            stk.pop();
        }

        return sb.toString();
    }

}
/*
 * Min Stack https://www.interviewbit.com/problems/min-stack/
 */

class Solution {
    Stack<Integer> min_stack = new Stack<>();
    Stack<Integer> stk = new Stack<>();

    public void push(int x) {
        stk.push(x);
        if (min_stack.isEmpty())
            min_stack.push(x);
        else {
            min_stack.push(Math.min(x, min_stack.peek()));
        }
    }

    public void pop() {
        if (!stk.isEmpty()) {
            stk.pop();
            min_stack.pop();
        }
        return;

    }

    public int top() {
        if (stk.isEmpty())
            return -1;

        return stk.peek();
    }

    public int getMin() {
        if (min_stack.isEmpty())
            return -1;

        return min_stack.peek();
    }
}

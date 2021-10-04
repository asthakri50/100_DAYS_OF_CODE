/*
 * Min Stack https://practice.geeksforgeeks.org/problems/special-stack/1#
 */
class GfG {
    Stack<Integer> min_so_far = new Stack<>();

    public void push(int a, Stack<Integer> s) {
        // add code here.
        s.push(a);
        if (min_so_far.isEmpty() || min_so_far.peek() > a)
            min_so_far.push(a);
        else
            min_so_far.push(min_so_far.peek());

        return;
    }

    public int pop(Stack<Integer> s) {
        // add code here.
        min_so_far.pop();

        return s.pop();

    }

    public int min(Stack<Integer> s) {
        // add code here.
        return min_so_far.peek();

    }

    public boolean isFull(Stack<Integer> s, int n) {
        // add code here.
        return s.size() == n;
    }

    public boolean isEmpty(Stack<Integer> s) {
        // add code here.
        return s.isEmpty();
    }
}
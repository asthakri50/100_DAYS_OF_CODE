/*
 * Next Greater Element
 * https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1
 */
class Solution {
    // Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code here
        long[] res = new long[n];
        Arrays.fill(res, -1);

        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (stk.isEmpty() || arr[i] <= arr[stk.peek()])
                stk.push(i);
            else {
                while (!stk.isEmpty() && arr[i] > arr[stk.peek()]) {
                    res[stk.peek()] = arr[i];
                    stk.pop();
                }
                stk.push(i);
            }
        }

        return res;
    }
}
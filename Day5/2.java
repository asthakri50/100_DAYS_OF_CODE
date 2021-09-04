/*
 * Kth Largest Element in an Array
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 */

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        return nums[n - k];
    }
}

// Approach 2 Using Min Heap
// Took more time complexity
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Using Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for (int i = 0; i < k; i++)
            minHeap.add(nums[i]);

        for (int i = k; i < nums.length; i++) {
            if (minHeap.peek() < nums[i]) {
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }

        return minHeap.peek();

    }
}

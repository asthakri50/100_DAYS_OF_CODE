/*
 * Binary Tree Level Order Traversal
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/
 * trees/628/
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null)
            return res;

        List<Integer> li = new LinkedList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size > 0) {
                TreeNode top = queue.peek();
                li.add(top.val);
                queue.poll();
                if (top.left != null)
                    queue.add(top.left);

                if (top.right != null)
                    queue.add(top.right);
                size--;

            }

            res.add(li);
            li = new ArrayList<Integer>();
        }

        return res;
    }
}
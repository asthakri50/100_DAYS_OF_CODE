/*
 * Symmetric Tree
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/
 * trees/627/
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        return helpSymmetric(root.left, root.right);

    }

    public boolean helpSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;

        if (left.val != right.val)
            return false;

        return helpSymmetric(left.left, right.right) && helpSymmetric(left.right, right.left);
    }
}
/*
 * Validate Binary Search Tree
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/
 * trees/625/
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isValid(TreeNode root, long min, long max) {
        if (root == null)
            return true;

        if (root.val <= min || root.val >= max)
            return false;

        boolean left = isValid(root.left, min, root.val);

        boolean right = isValid(root.right, root.val, max);

        return (left & right);

    }
}

// It does not work when the smallest node has the value Integer.MIN_VALUE or
// the largest node has the value Integer.MAX_VALUE?
// Hence, some changes are done.

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    public boolean isValid(TreeNode root, Long min, Long max) {
        if (root == null)
            return true;

        if ((min != null && root.val <= min) || (max != null && root.val >= max))
            return false;

        boolean left = isValid(root.left, min, (long) root.val);

        boolean right = isValid(root.right, (long) root.val, max);

        return (left & right);

    }
}
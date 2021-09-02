/*
  Unique Binary Search Trees II
  September Leetcode Challenge Day2
  https://leetcode.com/explore/challenge/card/september-leetcoding-challenge-2021/636/week-1-september-1st-september-7th/3961/
  
  
  
  Given an integer n, return all the structurally unique BST's (binary search trees), which has exactly n nodes of unique values from 1 to n. Return the answer in any order.

 

Example 1:


Input: n = 3
Output: [[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]
Example 2:

Input: n = 1
Output: [[1]]
 

Constraints:

1 <= n <= 8
*/

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public List<TreeNode> generateTrees(int end) {
        ArrayList<TreeNode> totalTreesFrom1toN = constructTrees(1, end);
        return totalTreesFrom1toN;
    }

    static ArrayList<TreeNode> constructTrees(int start, int end) {
        ArrayList<TreeNode> list = new ArrayList<>();
        /*
         * if start > end then subtree will be empty so returning NULL in the list
         */
        if (start > end) {
            list.add(null);
            return list;
        }

        /*
         * iterating through all values from start to end for constructing\ left and
         * right subtree recursively
         */
        for (int i = start; i <= end; i++) {
            /* constructing left subtree */
            ArrayList<TreeNode> leftSubtree = constructTrees(start, i - 1);

            /* constructing right subtree */
            ArrayList<TreeNode> rightSubtree = constructTrees(i + 1, end);

            /*
             * now looping through all left and right subtrees and connecting them to ith
             * root below
             */
            for (int j = 0; j < leftSubtree.size(); j++) {
                TreeNode left = leftSubtree.get(j);
                for (int k = 0; k < rightSubtree.size(); k++) {
                    TreeNode right = rightSubtree.get(k);
                    TreeNode node = new TreeNode(i); // making value i as root
                    node.left = left; // connect left subtree
                    node.right = right; // connect right subtree
                    list.add(node); // add this tree to list
                }
            }
        }
        return list;
    }
}
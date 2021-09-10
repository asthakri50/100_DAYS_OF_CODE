/*
 * Delete Node in a Linked List
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/
 * linked-list/553/
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public void deleteNode(ListNode node) {
        while (node.next.next != null) {
            node.val = node.next.val;
            node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
        return;
    }
}
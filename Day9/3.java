/*
 * Reverse Linked List
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/
 * linked-list/560/
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // Base Case
        if (head == null)
            return head;

        if (head.next == null)
            return head;
        ListNode nHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return nHead;
    }
}
/*
 * Linked List Cycle
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/
 * linked-list/773/
 */

/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if (head == null)
            return false;

        while (fast.next != null && fast.next.next != null && slow.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow)
                return true;
        }

        return false;
    }
}
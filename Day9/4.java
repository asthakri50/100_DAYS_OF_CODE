/*
 * Merge Two Sorted Lists
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/
 * linked-list/771/
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        ListNode p1 = l1;
        ListNode p2 = l2;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                if (tail == null) {
                    head = p1;
                    tail = p1;
                } else {
                    tail.next = p1;
                    tail = p1;
                }
                p1 = p1.next;
            } else {
                if (tail == null) {
                    head = p2;
                    tail = p2;
                } else {
                    tail.next = p2;
                    tail = p2;
                }
                p2 = p2.next;
            }
        }

        if (p1 != null) {
            if (tail == null)
                head = p1;
            else
                tail.next = p1;
        }

        if (p2 != null) {
            if (tail == null)
                head = p2;
            else
                tail.next = p2;
        }

        return head;

    }
}
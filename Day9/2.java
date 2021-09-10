/*
 * Remove Nth Node From End of List
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/
 * linked-list/603/
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        n = size - n;
        ListNode prev = head;
        temp = head;

        if (n == 0) {
            head = head.next;
            return head;
        }
        while (n > 0) {
            prev = temp;
            temp = temp.next;
            n--;
        }

        prev.next = temp.next;
        temp.next = null;

        return head;

    }
}
// leetcode 206 Reverse Linked List 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// recursive
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode next = head.next;
        head.next = null;

        ListNode tmp = reverseList(next);
        next.next = head;

        return tmp;
    }
}

// iteration
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;

        ListNode node0 = head, node1 = null, next = head;

        do {
            next = next.next;
            node0.next = node1;
            node1 = node0;
            node0 = next;
        } while (next != null);

        return node1;
    }
}

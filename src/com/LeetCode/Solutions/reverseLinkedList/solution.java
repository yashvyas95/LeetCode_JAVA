package com.LeetCode.Solutions.reverseLinkedList;

import java.util.*;

public class solution {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    /** Iterative */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    /** Recursive */
    public static ListNode reverse(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static void main(String[] args){
        ListNode node1 = new ListNode(4,null);
        ListNode node2 = new ListNode(3,node1);
        ListNode node3 = new ListNode(2,node2);
        ListNode node4 = new ListNode(1,node3);
        reverse(node4);
    }

}

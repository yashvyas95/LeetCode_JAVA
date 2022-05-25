package com.LeetCode.Solutions.MinStack;

import java.util.Stack;

public class solution {
    private class MinStack{
        Node head;

        public MinStack() {
        }

        public void push(int val) {
            if (head == null)
                head = new Node(val, val);
            else
                head = new Node(val, Math.min(head.min, val), head);
        }

        public void pop() {
            head = head.next;
        }

        public int top() {
            return head.val;
        }

        public int getMin() {
            return head.min;
        }

        class Node {
            int val;
            int min;
            Node next;
            public Node(int val, int min) {
                this.val = val;
                this.min = min;
                next = null;
            }
            public Node(int val, int min, Node head) {
                this.val = val;
                this.min = min;
                next = head;
            }
        }
    }
}



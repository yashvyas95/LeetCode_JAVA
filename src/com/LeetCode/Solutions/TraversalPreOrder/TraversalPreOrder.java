package com.LeetCode.Solutions.TraversalPreOrder;

import java.util.*;
import java.io.*;

public class TraversalPreOrder {
    public static void preOrder(Node root) {
        Stack<Node> container = new Stack<>();
        System.out.println(root.data);
        if (root.right != null) {
            container.push(root.right);
        }
        if (root.left != null) {
            container.push(root.left);
        }

        if (container.size() == 1) {
            var Node = container.pop();
            preOrder(Node);
        } else if (container.size() == 2) {
            Node n1 = container.pop();
            Node n2 = container.pop();
            preOrder(n1);
            preOrder(n2);
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        preOrder(root);
    }
}


class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}



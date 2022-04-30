package com.LeetCode.Solutions.BinaryTreeHeight;

import java.util.*;
import java.io.*;


class Solution {
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    /*
    class Node 
        int data;
        Node left;
        Node right;
    */
    public static Node lca(Node root, int v1, int v2) {
        // Write your code here.
        Node LCA = new Node(0);
        if (root.left != null && root.left.data != v1 && root.left.data != v2) {
            LCA = lca(root.left, v1, v2);
        }
        if (root.left != null && (root.left.data == v1 || root.left.data == v2)) {
            return root;
        }
        if (root.right != null && (root.right.data == v1 || root.right.data == v2)) {
            return root;
        }
        if (root.right != null && root.right.data != v1 && root.right.data != v2) {
            LCA = lca(root.right, v1, v2);
        }
        return LCA;

    }

    public static void main(String[] args) {
        Node root = new Node(9);
        root.left = new Node(7).left = new Node(5);
        root.right = new Node(6).left = new Node(1);
        root.right.right = new Node(3);
        root.left.right = new Node(8);
        System.out.println((lca(root, 1, 6)).data);
    }

}
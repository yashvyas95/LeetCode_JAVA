package com.LeetCode.Solutions.IsBinaryTree;

public class IsBinaryTree {

    static class Node {
        Node left;
        Node right;
        int data;

    }

    static boolean checkBST(Node root) {
        boolean result = true;
        if (root.left != null) {
            Node child = root.left;
            if (root.data <= child.data) {
                result = false;
                return false;
            } else {
                result = checkBST(root.left);
            }
        }
        if (root.right != null) {
            Node child = root.right;
            if (root.data >= child.data) {
                result = false;
                return false;
            } else {
                result = checkBST(root.right);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Node tree = new Node();
        tree.data = 3;
        tree.left = new Node();
        tree.left.data = 2;
        tree.right = new Node();
        tree.right.data = 4;
        tree.left.left = new Node();
        tree.left.left.data = 1;
        checkBST(tree);
    }
}
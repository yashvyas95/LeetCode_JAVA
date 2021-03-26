package com.LeetCode.Solutions.BinaryTreeInOrderTraversal;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class solution {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public static void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                helper(root.right, res);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode fLeft = new TreeNode(2);
        TreeNode fRight = new TreeNode(3);
        root.left = fLeft;
        root.right = fRight;
        TreeNode sLeft = new TreeNode(4);
        TreeNode sRight = new TreeNode(5);
        fLeft.left = sLeft;
        fLeft.right = sRight;
        TreeNode s2Left = new TreeNode(6);
        TreeNode s2Right = new TreeNode(7);
        sLeft.left = s2Left;
        sLeft.right = s2Right;
        inorderTraversal(root);
    }

}

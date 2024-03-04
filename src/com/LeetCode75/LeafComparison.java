package com.LeetCode75;

public class LeafComparison {

    public class TreeNode {
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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        String l1 = getMeLeafSequence(root1, "");
        String l2 = getMeLeafSequence(root2, "");

        return l1 == l2;
    }

    public String getMeLeafSequence(TreeNode node, String s) {
        if (node.left == null && node.right == null) {
            System.out.println(s + String.valueOf(node.val));
            return s + String.valueOf(node.val);
        }
        if (node.left != null)
            s = getMeLeafSequence(node.left, s);
        if (node.right != null)
            s = getMeLeafSequence(node.right, s);
        return s;
    }

}

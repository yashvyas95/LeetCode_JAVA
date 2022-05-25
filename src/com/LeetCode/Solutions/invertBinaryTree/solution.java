package com.LeetCode.Solutions.invertBinaryTree;
import java.util.ArrayDeque;
import java.util.Queue;
public class solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while(!q.isEmpty()){
            var node = q.poll();
            if(node.left!=null)
                q.add(node.left);
            if(node.right!=null)
                q.add(node.right);

        }
        return null;
    }
}

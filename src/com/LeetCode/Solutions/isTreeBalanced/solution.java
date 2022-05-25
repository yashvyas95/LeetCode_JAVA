package com.LeetCode.Solutions.isTreeBalanced;



class Solution {
    class TreeNode {
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

    class information
    {
        int height;
        boolean balanced;

        information(int h, boolean b){
            height = h;
            balanced = b;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return (returnBalancedWithHeight(root).balanced);
    }


    public information returnBalancedWithHeight(TreeNode root){
        if(root == null)
            return new information(1,true);

        var left = (returnBalancedWithHeight(root.left));
        var right = (returnBalancedWithHeight(root.right));

        if(!left.balanced || !right.balanced)
            return new information(-1,false);
        if(Math.abs(left.height-right.height)<=1)return new information(Math.max(left.height,right.height)+1,true);
        return new information(-1,false);

    }
}
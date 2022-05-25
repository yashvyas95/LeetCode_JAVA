package com.LeetCode.Solutions.sameBinaryTree;
import java.util.ArrayDeque;
import java.util.ArrayList;
public class solution {

    /**
     * Check Whether given two graphs are same or not.
     *
     * Approach : create Adj list for both graph and check whether two list are same or not.
     *            For efficiency use stopping condition as well;
     *            Use BFS : Breadth First Search.
     *
     *
     *
     * */


    public static class TreeNode {
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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayDeque<TreeNode> q1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> q2 = new ArrayDeque<>();
        if(p==null && q==null)return true;
        if((p==null && q!=null) || (p!=null && q==null) )return false;
        q1.add(p);
        q2.add(q);
        while(q1.size()!=0 && q2.size()!=0)
        {
             var presentNode1 = q1.poll();
             var presentNode2 = q2.poll();

             if(presentNode1.val!=presentNode2.val)return false;

             if((presentNode1.left!=null && presentNode2.left==null) || (presentNode1.left==null && presentNode2.left!=null) )return false;
             if((presentNode1.right!=null && presentNode2.right==null) || (presentNode1.right==null && presentNode2.right!=null) )return false;

             if(presentNode1.left!=null){
                 q1.add(presentNode1.left);
                 q2.add(presentNode2.left);
             }
            if(presentNode1.right!=null){
                q1.add(presentNode1.right);
                q2.add(presentNode2.right);
            }
        }
        return true;
    }

    public static boolean recursive_isSameTree(TreeNode p , TreeNode q){
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args){
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        n1.left = n2;
        n1.right = n3;
        System.out.println(isSameTree(n1,n1));
    }
}

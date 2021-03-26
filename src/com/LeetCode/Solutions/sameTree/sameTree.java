package com.LeetCode.Solutions.sameTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

public class sameTree {

    public static void main(String[] args) {
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(2);//q.left=new TreeNode(2);
        p.left = null;
        p.right = new TreeNode(4);
        q.left = new TreeNode(3);
        q.right = new TreeNode(4);
        System.out.println(isSameTree(p, q));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        boolean result = true;
        HashMap<TreeNode, TreeNode[]> tree = new HashMap<>();
        List<Integer> tree_list = new ArrayList<Integer>();
        List<TreeNode> childrens = new ArrayList<TreeNode>();
        List<TreeNode> childrens2 = new ArrayList<TreeNode>();
        if (p != null && q != null && p.val == q.val) {
            tree_list.add(p.val);
            childrens.add(p);
            childrens2.add(q);
        } else {
            if (p != null && q == null) {
                result = false;
            }
            if (p == null && q != null) {
                result = false;
            }
            if (p != null && q != null) {
                if (p.val != q.val) {
                    result = false;
                }
            }

        }
        while (childrens.size() != 0) {
            p = childrens.get(0);
            q = childrens2.get(0);
            childrens.remove(0);
            childrens2.remove(0);
            if (p.left != null && q.left != null && p.val == q.val && p.left.val == q.left.val) {
                childrens.add(p.left);
                childrens2.add(q.left);
                tree_list.add(p.left.val);

            }
            if (p.right != null && q.right != null && p.right.val == q.right.val) {
                childrens.add(p.right);
                childrens2.add(q.right);
                tree_list.add(p.right.val);
            }
            if ((p.left == null && q.left != null) || (p.left != null && q.left == null)) {
                result = false;
            }
            if ((p.right == null && q.right != null) || (p.right != null && q.right == null)) {
                result = false;
            } else {
                if (p.left != null && q.left != null) {
                    if (p.left.val != q.left.val) {
                        result = false;
                    }
                }
                if (p.right != null && q.right != null) {
                    if (p.right.val != q.right.val) {
                        result = false;
                    }
                }
                if (p.left == null && q.left == null) {
                    tree_list.add(null);
                }
                if (p.right == null && q.right == null) {
                    tree_list.add(null);
                }
                if ((p.left == null && q.left != null) || (p.left != null && q.left == null)) {
                    result = false;
                }
                if ((p.right == null && q.right != null) || (p.right != null && q.right == null)) {
                    result = false;
                }

            }
            tree.put(p, new TreeNode[]{p.left, p.right});
        }
        return result;
    }


    public static boolean isSameTree2(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        // one of p and q is null
        if (q == null || p == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }

}

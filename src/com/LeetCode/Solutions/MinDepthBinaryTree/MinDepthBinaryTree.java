package com.LeetCode.Solutions.MinDepthBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepthBinaryTree {

    public static class TreeNode {
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

    public static int minDepth(TreeNode root) {
        // idiot - proof
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        }
        return breadthFirstSearchAlgorithm(root);
    }

    private static int breadthFirstSearchAlgorithm(TreeNode root) {

        // 1. declare an queue to do the BFS
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        // 2. insert the root node into the queue
        queue.add(root);
        int minLevel = 0;
        // 3. looping
        while (!queue.isEmpty()) {
            // 4. declare the queue size and reset the value after ends up the outer loop
            int queueSize = queue.size();
            minLevel++;
            for (int i = 0; i < queueSize; i++) {
                // 5. Dequeue : retrieve the head node
                TreeNode currentNode = queue.poll();

				/*
					The for-loop doing three steps :
						1st, check if the left child node is not null, and enqueue
						2nd, check if the right child node is not null, and enqueue
						3rd, check if both nodes are empty, if yes, then record down its' level, cuz its' the minimum level
				*/

                // 6-1. Enqueue : insert the left child into the queue
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                // 6-2. Enqueue : insert the right child node into the queue
                if (currentNode.right != null) {


                    queue.add(currentNode.right);
                }

                // 6-3. Check if both nodes are empty
                if (currentNode.left == null && currentNode.right == null) {
                    return minLevel;
                }

            }
        }

        return minLevel;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(minDepth(root));
    }

}

package com.way.TreeProg;

import com.way.hackerRank.TreeNode;

public class MaxPathSum {
	static int maxValue;
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		//root.left.left = new TreeNode(3);
		//root.left.right = new TreeNode(4);
		//root.right.left = new TreeNode(4);
		//root.right.right = new TreeNode(5);
		
		int m = maxPathSum(root);
		System.out.println(m);
	}

    
    public static int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue;
    }
    private static int maxPathDown(TreeNode node) {
        if (node == null) return 0;
        int left = maxPathDown(node.left);
        int right = maxPathDown(node.right);
        int maxSt = Math.max(Math.max(left, right)+node.val, node.val);
        int maxCase = Math.max(maxSt, left+right+node.val);
        maxValue = Math.max(maxCase, maxValue);
        //System.out.println(maxValue);
        return maxSt;
    }

}

    
    
    


package com.way.TreeProg;

import com.way.hackerRank.TreeNode;

public class HeightBalancedBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(6);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(2);
		/*root.left.right = new TreeNode(11);
		root.left.right.left = new TreeNode(9);
		root.left.right.right = new TreeNode(5);
		//root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(13);
		root.right.right.left = new TreeNode(7);*/
		
		HeightBalancedBinaryTree obj = new HeightBalancedBinaryTree();
		int t=obj.isHeightBalance(root);
		if(t!=-1)
			System.out.println("Balanced Tree");
		else
			System.out.println("Not Balanced Tree");
		
	}
	
	int isHeightBalance(TreeNode root) 
    { 
        if (root == null) 
            return 0; 
        if(root.left == null && root.right ==null)
        	return 1;
        int lh = isHeightBalance(root.left);
        int rh = isHeightBalance(root.right);
        if(lh==-1 || rh ==-1 || Math.abs(lh - rh) > 1)
        	return -1;
        
        return Math.max(lh,rh)+1;
        			
        
    }
	
	

}

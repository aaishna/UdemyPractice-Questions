package com.way.TreeProg;

import com.way.hackerRank.TreeNode;

public class LowestCommonAncestorInBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(6);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(11);
		root.left.right.left = new TreeNode(9);
		root.left.right.right = new TreeNode(5);
		//root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(13);
		root.right.right.left = new TreeNode(7);
		TreeNode n1 = new TreeNode(8);
		TreeNode n2 = new TreeNode(7);
		LowestCommonAncestorInBinaryTree obj = new LowestCommonAncestorInBinaryTree();
		TreeNode t=obj.LCA(root,n1,n2);
		System.out.println(t.val);
		
	}
	
	TreeNode LCA(TreeNode root,TreeNode n1, TreeNode n2) 
    { 
        if (root == null) 
            return null; 
        if(root.val == n1.val || root.val == n2.val)
        	return root;
        TreeNode left = LCA(root.left,n1,n2);
        TreeNode right = LCA(root.right,n1,n2);
        if(left!=null && right!=null)
        	return root;
        if(left == null && right ==null)
        	return null;
        return left!=null ? left : right;
        			
        
    }
	
	

}

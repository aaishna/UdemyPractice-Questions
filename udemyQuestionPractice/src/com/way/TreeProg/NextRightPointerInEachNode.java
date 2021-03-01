package com.way.TreeProg;

import com.way.hackerRank.TreeNode;

public class NextRightPointerInEachNode {

	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
	       tree.left= new TreeNode(2); 
	       tree.right= new TreeNode(3); 
	       tree.left.left= new TreeNode(4); 
	       tree.left.right= new TreeNode(5); 
	       tree.left.left.left= new TreeNode(6); 
	       tree.left.right.right= new TreeNode(7); 
	       Node n =help(tree);

	}
	public static Node help(TreeNode root){
		TreeNode tree = root;
		while(tree !=null){
			if(tree.left!=null)
				tree.left.right = tree.right;
			if(tree.)
		}
		
	}

}

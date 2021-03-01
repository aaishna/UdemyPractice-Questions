package com.way.TreeProg;

import com.way.hackerRank.TreeNode;

class DiameterofBinaryTree 
{ 
	
	static int maxValue=0;
	public static void main(String args[]) 
	{ 
		DiameterofBinaryTree tree = new DiameterofBinaryTree(); 
		TreeNode root = new TreeNode(1);
		
		root.left= new TreeNode(2); 
		root.right= new TreeNode(3); 
		root.left.left= new TreeNode(4); 
		root.left.right= new TreeNode(5); 
 
		tree.diameter(root); 
		System.out.println(maxValue);
	} 
	
	
	
	private  int diameter(TreeNode node) {
        if (node == null) return 0;
        int left = diameter(node.left);
        int right = diameter(node.right);
        int t = Math.max(left, right) + 1;
       // int maxSt = Math.max(t, node.val);
        int maxCase = Math.max(t, left+right+1);
        maxValue = Math.max(maxCase, maxValue);
        //System.out.println(maxValue);
        return t;
    }
 

/* Driver program to test above functions */

} 
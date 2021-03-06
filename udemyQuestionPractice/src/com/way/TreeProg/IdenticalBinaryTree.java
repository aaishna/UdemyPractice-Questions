package com.way.TreeProg;

import com.way.hackerRank.TreeNode;

public class IdenticalBinaryTree {

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(3);
		root1.left = new TreeNode(6);
		root1.right = new TreeNode(8);
		root1.left.left = new TreeNode(2);
		/*root.left.right = new TreeNode(11);
		root.left.right.left = new TreeNode(9);
		root.left.right.right = new TreeNode(5);
		//root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(13);
		root.right.right.left = new TreeNode(7);*/
		
		TreeNode root2= new TreeNode(3);
		root2.left = new TreeNode(6);
		root2.right = new TreeNode(8);
		root2.left.left = new TreeNode(2);
		//root2.right.left = new TreeNode(8);
		
		IdenticalBinaryTree obj = new IdenticalBinaryTree();
		System.out.println(obj.isIdentical(root1,root2));
		
	}
	
	boolean isIdentical(TreeNode t1, TreeNode t2) 
    { 
        if (t1 == null && t2==null) 
            return true; 
        if(t1== null || t2 ==null)
        	return false;
        
        return (t1.val == t2.val) && isIdentical(t1.left,t2.left) 
        		&& isIdentical(t1.right, t2.right);
        			
        
    }
	
	

}

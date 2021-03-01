package com.way.TreeProg;

import com.way.hackerRank.TreeNode;

public class SymmetricBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(6);
		root.right = new TreeNode(6);
		//root.left.left = new TreeNode(2);
		/*root.left.right = new TreeNode(11);
		root.left.right.left = new TreeNode(9);
		root.left.right.right = new TreeNode(5);
		//root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(13);
		root.right.right.left = new TreeNode(7);*/
		
		
		SymmetricBinaryTree obj = new SymmetricBinaryTree();
		System.out.println(obj.isSymmetric(root.left,root.right));
		
	}
	
	boolean isSymmetric(TreeNode t1, TreeNode t2) 
    { 
        if (t1 == null && t2==null) 
            return true; 
        if(t1== null || t2 ==null)
        	return false;
        
        return (t1.val == t2.val) && isSymmetric(t1.left,t2.right)
        		&& isSymmetric(t1.right, t2.left);
        			
        
    }
	
	

}

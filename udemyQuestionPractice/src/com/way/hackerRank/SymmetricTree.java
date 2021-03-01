package com.way.hackerRank;

public class SymmetricTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
		boolean t = isSymmetric(root);
		System.out.println("is mirror -"+t);

	}
	public static boolean isSymmetric(TreeNode root) {
		if(root==null)
			return true;
		else
			return check(root.left, root.right);
		
	}
	public static boolean check(TreeNode t1, TreeNode t2){
		if(t1==null && t2==null)
			return t1==t2;
		if(t1.val == t2.val)
			return check(t1.left,t2.right) && check(t1.right,t2.left);
		
		return false;
	}

}

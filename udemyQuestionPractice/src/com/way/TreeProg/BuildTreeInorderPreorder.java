package com.way.TreeProg;

import com.way.hackerRank.TreeNode;

public class BuildTreeInorderPreorder {

	static int[] preorder= {3,9,20,15,7};
	static int[] inorder= {9,3,15,20,7};
	public static void main(String[] args) {
		TreeNode t = buildTree(preorder, inorder);
		preOrderTraversal(t);
		

	}
	
	public static void preOrderTraversal(TreeNode root){
		if(root!=null)
			System.out.println(root.val);
		else
			return;
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}



	public static TreeNode buildTree(int[] preorder, int[] inorder) {
		return helper(0, 0, inorder.length - 1, preorder, inorder);
	}

	public static TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
		if (preStart > preorder.length - 1 || inStart > inEnd) {
			return null;
		}
		TreeNode root = new TreeNode(preorder[preStart]);
		int inIndex = 0; // Index of current root in inorder
		for (int i = inStart; i <= inEnd; i++) {
			if (inorder[i] == root.val) {
				inIndex = i;
			}
		}
		root.left = helper(preStart + 1, inStart, inIndex - 1, preorder, inorder);
		root.right = helper(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);
		return root;
	}
}

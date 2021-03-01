package com.way.TreeProg;

import com.way.hackerRank.TreeNode;

public class SortedArrayToBinaryTree {

	
	public static void main(String[] args) {
		int[] arr = {-10,-3,0,5,9}; 
		TreeNode t = sortedArrayToBST(arr);
		
		preOrderTraversal(t);
	}
	public static TreeNode sortedArrayToBST(int[] nums) {
		TreeNode t=helper(0,nums.length-1,nums);
		
		return t;
		 
	 }
	public static TreeNode helper(int low, int high, int[] nums){
		int  mid;
		if(low > high)
			return null;
		mid = (low + high)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = helper(low,mid-1,nums);
		root.right = helper(mid+1,high,nums);
		return root;
		
	}
	
	public static void preOrderTraversal(TreeNode root){
		if(root!=null)
			System.out.println(root.val);
		else
			return;
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}

	
}

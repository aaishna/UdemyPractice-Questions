package com.way.hackerRank;

public class TreeNode {
	public int val;
	      public TreeNode left;
	      public TreeNode right;
	      public int height;
	      public TreeNode() {}
	      public TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	      TreeNode(int val, TreeNode left, TreeNode right, int height) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	          this.height = height;
	      }

}

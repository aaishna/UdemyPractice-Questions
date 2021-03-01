package com.way.hackerRank;

import java.util.List;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		//root.left.left = new TreeNode(3);
		//root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		levelOrderPrint(root);
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		return null;
        
    }
	
	public static int height(TreeNode root){
		if(root == null)
			return 0;
		int lh = height(root.left);
		int rh = height(root.right);
		if(lh > rh)
			return lh + 1;
		return rh + 1;
	}
	
	public static void levelOrderPrint(TreeNode root){
		int h = height(root);
		System.out.println("height is = "+h);
		for(int i=1; i<=h; i++){
			printlevel(root,i);
			System.out.println();
		}
		
	}
	
	public static void printlevel(TreeNode root, int level){
		int count=0;
		count++;
		if(root == null){
			System.out.println(root);
			return;
		}			
		if(level == 1)
			System.out.print(root.val+ "  ");
		else if(level > 1 && count%2!=0){
			printlevel(root.left, level-1);
			printlevel(root.right, level-1);
		}
		else if(level > 1 && count%2==0){
			
			printlevel(root.right, level-1);
			printlevel(root.left, level-1);
		}
	}

}

package com.way.TreeProg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.way.hackerRank.TreeNode;

public class CheckBST {
	/*
	 * Depth First Traversals:
(a) Inorder (Left, Root, Right) : 4 2 5 1 3
(b) Preorder (Root, Left, Right) : 1 2 4 5 3
(c) Postorder (Left, Right, Root) : 4 5 2 3 1


	 */
	static int min=Integer.MIN_VALUE;
	static int max=Integer.MAX_VALUE;
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		CheckBST obj = new CheckBST();
		//obj.printPostorder(root);
		//System.out.println();
		//obj.printInorder(root);
		//System.out.println();
		
		TreeNode rootBST = new TreeNode(2);
		rootBST.left = new TreeNode(1);
		rootBST.right = new TreeNode(3);
		
		obj.printPreorder(rootBST,min,max);
	}
	
	void printPostorder(TreeNode node) 
    { 
        if (node == null) 
            return; 
  
        // first recur on left subtree 
        printPostorder(node.left); 
  
        // then recur on right subtree 
        printPostorder(node.right); 
  
        // now deal with the node 
        System.out.print(node.val + " "); 
    } 
	
	void printInorder(TreeNode node) 
    { 
        if (node == null) 
            return; 
  
        /* first recur on left child */
        printInorder(node.left); 
  
        /* then print the data of node */
        System.out.print(node.val + " "); 
  
        /* now recur on right child */
        printInorder(node.right); 
    } 
  
    /* Given a binary tree, print its nodes in preorder*/
    boolean printPreorder(TreeNode node,int min, int max) 
    { 
        if (node == null) 
            return true; 
        
        if(node.val < min || node.val > max)
        	return false;
        
        /* first print data of node */
        System.out.print(node.val + " "); 
  
        /* then recur on left sutree */
       
        	return printPreorder(node.left,min,node.val) &&
       
        	printPreorder(node.right,node.val,max); 
        
        	
    }
	
	
	

}

package com.way.hackerRank;

import java.util.HashMap;

public class Rough {
	public static void main(String[] args){
		//String[] arr = {"flower","flow","flight"};
		//String s = "anagram", t = "nagaram";
		int[] arr = {10, 90, 49, 2, 1, 5, 23};
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(2);
		node.next.next.next = new ListNode(1);
		//node.next.next.next.next = new ListNode(5);
		
		ListNode nodeB = new ListNode(5);
		nodeB.next = new ListNode(6);
		nodeB.next.next = new ListNode(11);
		ListNode temp = nodeB.next.next;
		nodeB.next.next.next = new ListNode(12);
		
		/*TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(1);*/
		
		
		
		deleteGivenNode(temp);
		display(nodeB);
		
			//System.out.println("Result is "+res);	
	}
	
	public static void deleteGivenNode(ListNode node){
		ListNode temp = node.next;
		node.val = temp.val;
		node.next = temp.next;
	
	}
	
	public static void display(ListNode node){
		while(node != null){
			System.out.println(node.val);
			node = node.next;
		}
	
	}
	
	
	
	
	 
	
	
}
	

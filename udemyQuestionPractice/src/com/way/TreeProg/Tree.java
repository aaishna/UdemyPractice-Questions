package com.way.TreeProg;

import java.util.ArrayList;

public class Tree { 
	ArrayList<Integer> list = new ArrayList<>();
	static class Node {    
		int value; 
		Node left, right; 

		Node(int value){ 
			this.value = value; 
			left = null; 
			right = null; 
		} 
	} 

	public void insert(Node node, int value) {
		if (value < node.value) { 
			if (node.left != null) {
				insert(node.left, value); 
			} else { 
				System.out.println(" Inserted " + value + " to left of " + node.value);
				node.left = new Node(value);
			}
		} else if (value > node.value) {
			if (node.right != null) {
				insert(node.right, value);
			} else {
				System.out.println("  Inserted " + value + " to right of "
						+ node.value);
				node.right = new Node(value);
			}
		}
	}
	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.value);
			traverseInOrder(node.right);
		}
	}
	public ArrayList<Integer> traverseLeftTree(Node node) {
		
		if(node != null){
			list.add(node.value);
			traverseLeftTree(node.left);
			
		}
	    return list;
	}
	

	public static void main(String args[]) 
	{ 
		Tree tree = new Tree();
		Node root = new Node(1);
		System.out.println("Binary Tree Example");
		System.out.println("Building tree with root value " + root.value);
		
		tree.insert(root, 2);
		tree.insert(root, 4);
		tree.insert(root, 8);
		tree.insert(root, 6);
		tree.insert(root, 7);
		tree.insert(root, 3);
		tree.insert(root, 9);
		System.out.println("Traversing tree in order");
		ArrayList<Integer> t=tree.traverseLeftTree(root);
		for(int i=0; i<t.size(); i++)
			//System.out.println(t.get(i));
		tree.traverseInOrder(root);

	}
}


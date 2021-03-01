package com.way.TreeProg;

import java.util.ArrayList;

import com.way.hackerRank.TreeNode;

class SearalozeDeSerializeBinaryTree 
{ 
	
	static int index=0;
	public static void main(String args[]) 
	{ 
		SearalozeDeSerializeBinaryTree tree = new SearalozeDeSerializeBinaryTree(); 
		TreeNode root = new TreeNode(1);
		
		root.left= new TreeNode(2); 
		root.right= new TreeNode(3); 
		root.left.left= new TreeNode(4); 
		root.left.right= new TreeNode(5); 
		ArrayList<Integer> list = new ArrayList<>();
		tree.serialize(root,list); 
		TreeNode node=tree.deSerialize(list);
		tree.display(node);
	} 
	
	
	public void display (TreeNode node){
		if(node == null)
			return;
		System.out.println(node.val);
		display(node.left);
		display(node.right);
	}
	public void serialize(TreeNode node, ArrayList<Integer> list) {
        if(node == null){
        	list.add(-1);
        	return;
        }

        list.add(node.val);
        serialize(node.left,list);
        serialize(node.right,list);
        
        	
    }
	
	public TreeNode deSerialize(ArrayList<Integer> list) {
		if(list.get(index) == -1){
			index++;
			return null;
		}
		TreeNode node = new TreeNode(list.get(index++));
		node.left = deSerialize(list);
		node.right = deSerialize(list);
		return node;
    }
 

/* Driver program to test above functions */

} 
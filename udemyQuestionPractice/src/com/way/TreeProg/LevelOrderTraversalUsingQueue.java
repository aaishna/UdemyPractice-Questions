package com.way.TreeProg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.way.hackerRank.TreeNode;

public class LevelOrderTraversalUsingQueue {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		//root.left.left = new TreeNode(3);
		//root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(5);
		display(root);
	}
	
	public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        List<List<Integer>> levelOrderList = new ArrayList<>();
        qu.add(root);
        
        List<Integer> right = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
       
        while(!qu.isEmpty()){
            	int size = qu.size();
        	//System.out.println("size is "+size);
        	List<Integer> level = new ArrayList<>();
        	for(int i =1; i<=size; i++){
        		
        		TreeNode cur = qu.remove();
        		if(cur!=null){
        			level.add(cur.val);
            		if(cur.left!=null)
            			qu.add(cur.left);
            		if(cur.right!=null)
            			qu.add(cur.right);
        		}      		
        		
        	}
        	int m = level.size();
        	right.add(level.get(m-1));
        	left.add(level.get(0));
        	levelOrderList.add(level);
        }
        for(int i=0; i<left.size(); i++)
        	System.out.println(left.get(i));
        System.out.println("right tree ");
        for(int i=0; i<right.size(); i++)
        	System.out.println(right.get(i));
        return levelOrderList;
    }
	
	public static void display(TreeNode root){
		List<List<Integer>> levelOrderList = levelOrder(root);
		Iterator<List<Integer>> itr= levelOrderList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().toString());
		}
	}

}

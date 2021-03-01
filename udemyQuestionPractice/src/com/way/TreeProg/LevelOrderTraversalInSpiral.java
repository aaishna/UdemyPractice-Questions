package com.way.TreeProg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.way.hackerRank.TreeNode;

public class LevelOrderTraversalInSpiral {

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
       int c=0;
        while(!qu.isEmpty()){
        	c++;
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
        	if(c%2!=0){
        		Collections.reverse(level);
        	}
        	levelOrderList.add(level);
        }
        
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

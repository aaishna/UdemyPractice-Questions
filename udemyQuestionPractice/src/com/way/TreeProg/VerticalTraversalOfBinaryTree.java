package com.way.TreeProg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

import com.way.hackerRank.TreeNode;

public class VerticalTraversalOfBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(8);
		root.right = new TreeNode(22);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(3);
		root.left.right.left = new TreeNode(10);
		root.left.right.right = new TreeNode(14);
		root.right.right = new TreeNode(25);
		root.right.right.left = new TreeNode(4);
		levelOrder(root);
	}
	
	public static void levelOrder(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
       
        qu.add(root);
        
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        
        while(!qu.isEmpty()){
            	
        		TreeNode cur = qu.remove();
        		int h = cur.height;
        		if(map.get(h)==null){
        			ArrayList<Integer> list = new ArrayList<>();
        			list.add(cur.val);
        			map.put(h, list);
        		}else{
        			ArrayList<Integer> list = map.get(h);
        			list.add(cur.val);
        			map.put(h, list);	
        		}
        		if(cur!=null){
        			
            		if(cur.left!=null){
            			cur.left.height = h-1;
            			qu.add(cur.left);
            		}
            			
            		if(cur.right!=null){
            			cur.right.height = h+1;
            			qu.add(cur.right);
            		}
            			
        		}      		

        }
        for(Entry<Integer, ArrayList<Integer>> m: map.entrySet()){
        	System.out.println(m.getValue());
        }
       
    }
	

}

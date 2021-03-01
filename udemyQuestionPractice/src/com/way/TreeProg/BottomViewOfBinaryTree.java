package com.way.TreeProg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

import com.way.hackerRank.TreeNode;

public class BottomViewOfBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(8);
		root.right = new TreeNode(22);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(3);
		root.left.right.left = new TreeNode(10);
		root.left.right.right = new TreeNode(14);
		root.right.right = new TreeNode(25);
		//root.right.right.left = new TreeNode(4);
		levelOrder(root);
	}
	
	public static void levelOrder(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
       
        qu.add(root);
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(!qu.isEmpty()){
            	
        		TreeNode cur = qu.remove();
        		int h = cur.height;
        		map.put(h, cur.val);
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
        System.out.println(map.values());
    }
	

}

package com.way.TreeProg;

import com.way.hackerRank.ListNode;

public class insertionSort {
	
	node head; 
    node sorted; 
    
	class node  
    { 
        int val; 
        node next; 
  
        public node(int val)  
        { 
            this.val = val; 
        } 
    } 
	
	public ListNode insertionSortList(ListNode head) {
		ListNode temp = head;
        int key = head.val;
        while(head!=null){
        	head = head.next;
        	if(key>head.val){
        		
        	}
        }
		return head;
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

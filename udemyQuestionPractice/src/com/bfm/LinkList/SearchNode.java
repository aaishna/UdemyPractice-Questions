package com.bfm.LinkList;

import com.way.hackerRank.ListNode;

public class SearchNode {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode temp = head;
		RemoveNthNodeFromLast obj = new RemoveNthNodeFromLast();
		//obj.add(temp, 2);
		/*obj.add(temp, 3);
		obj.add(temp, 4);
		obj.add(temp, 5);
		obj.add(temp, 6);*/
		//obj.display(temp);
		SearchNode ob = new SearchNode();
		boolean x = ob.search(null,2);
		System.out.println("search "+x);
		

	}
	
	boolean search(ListNode head,int no)
    {
		while(head!=null){
			if(head.val == no)
				return true;
			head = head.next;
		}
		return false;
    }

}

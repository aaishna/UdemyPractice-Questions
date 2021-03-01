package com.bfm.LinkList;

import com.way.hackerRank.ListNode;

public class DeleteFrontNode {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode temp = head;
		RemoveNthNodeFromLast obj = new RemoveNthNodeFromLast();
		obj.add(temp, 2);
		/*obj.add(temp, 3);
		obj.add(temp, 4);
		obj.add(temp, 5);
		obj.add(temp, 6);*/
		obj.display(temp);
		DeleteFrontNode ob = new DeleteFrontNode();
		ListNode x = ob.position(head);
		System.out.println("delete last");
		obj.display(x);

	}
	
	ListNode position(ListNode head)
    {
		ListNode t = head;
		if(head == null || head.next == null)
			return null;
		
		while(head.next.next!=null){
			head = head.next;
		}
		head.next = null;
		return t;
		
    }

}

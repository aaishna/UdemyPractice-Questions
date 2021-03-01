package com.bfm.LinkList;

import com.way.hackerRank.ListNode;

public class FindMiddleElement {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode temp = head;
		RemoveNthNodeFromLast obj = new RemoveNthNodeFromLast();
		obj.add(temp, 2);
		obj.add(temp, 3);
		obj.add(temp, 4);
		obj.add(temp, 5);
		obj.add(temp, 6);
		obj.display(temp);
		FindMiddleElement ob = new FindMiddleElement();
		ListNode x = ob.getMiddle(head);
		System.out.println("middle element");
		System.out.println(x.val);

	}
	
	ListNode getMiddle(ListNode head)
    {
		ListNode slow=head, fast=head;
		
		while(fast!=null && fast.next!=null){
			slow= slow.next;
			fast= fast.next.next;
		}
		
		return slow;
    }

}

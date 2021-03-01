package com.bfm.LinkList;

import com.way.hackerRank.ListNode;

public class InsertFront {

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
		InsertFront ob = new InsertFront();
		ListNode x = ob.front(head,45);
		System.out.println("after adding at front");
		obj.display(x);

	}
	
	ListNode front(ListNode head, int val)
    {
		ListNode node = new ListNode(val);
		node.next = head;
		return node;
    }

}

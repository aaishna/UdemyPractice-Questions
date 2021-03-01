package com.bfm.LinkList;

import com.way.hackerRank.ListNode;

public class SizeOfLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode temp = head;
		RemoveNthNodeFromLast obj = new RemoveNthNodeFromLast();
		obj.add(temp, 2);
		/*obj.add(temp, 3);
		obj.add(temp, 4);
		obj.add(temp, 5);
		obj.add(temp, 6);*/
		//obj.display(temp);
		SizeOfLinkedList ob = new SizeOfLinkedList();
		int x = ob.size(head);
		System.out.println("size "+x);
		

	}
	
	int size(ListNode head)
    {
		int s = 0;
		while(head!=null){
			s = s+1;
			head = head.next;
		}
		return s;
    }

}

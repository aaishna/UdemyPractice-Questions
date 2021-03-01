package com.bfm.LinkList;

import com.way.hackerRank.ListNode;

public class DeleteNodeAtPos {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode temp = head;
		RemoveNthNodeFromLast obj = new RemoveNthNodeFromLast();
		obj.add(temp, 2);
		obj.add(temp, 3);
		/*obj.add(temp, 4);
		obj.add(temp, 5);
		obj.add(temp, 6);*/
		//obj.display(temp);
		DeleteNodeAtPos ob = new DeleteNodeAtPos();
		ListNode x = ob.position(head,1);
		System.out.println("delete at pos");
		obj.display(x);

	}
	
	ListNode position(ListNode head, int pos)
    {
		ListNode temp = head;
		int i=1;
		if(pos<=0){
			System.out.println("not a valid position");
			return null;
		}
			
		if(head == null)
			return null;
		if(pos == 1){
			ListNode t = head.next;
			return t;
		}
		while(head.next!=null && i < pos-1){
			head = head.next;
		}
	
		ListNode t = head.next.next;
		head.next = t;
		
		return temp;
		
    }

}

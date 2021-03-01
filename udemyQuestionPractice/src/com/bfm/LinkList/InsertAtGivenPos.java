package com.bfm.LinkList;

import com.way.hackerRank.ListNode;

public class InsertAtGivenPos {

	public static void main(String[] args) {
		
		RemoveNthNodeFromLast obj = new RemoveNthNodeFromLast();
		/*obj.add(temp, 2);
		obj.add(temp, 3);
		obj.add(temp, 4);
		obj.add(temp, 5);
		obj.add(temp, 6);*/
		//obj.display(temp);
		InsertAtGivenPos ob = new InsertAtGivenPos();
		ListNode x = ob.position(null,1,100);
		ListNode x1 = ob.position(x,2,200);
		ListNode x2 = ob.position(x1,3,300);
		System.out.println("insert at pos");
		obj.display(x2);

	}
	
	ListNode position(ListNode head, int pos, int val)
    {
		ListNode node = new ListNode(val);
		if(pos == 1 && head ==null){
			
			return node;
		} 
		if(pos == 1 && head !=null){
			
			node.next = head;
			return node;
		}
		ListNode t = head;
		
		node.next = head;
		int i=1;
		while(head.next!=null && i<pos-1){
			head = head.next;
			i++;
		}
		ListNode temp = head.next;
		head.next = node;
		node.next = temp;
		return t;
    }

}

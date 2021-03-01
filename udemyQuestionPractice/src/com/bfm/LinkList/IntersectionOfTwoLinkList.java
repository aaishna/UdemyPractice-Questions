/* https://www.youtube.com/watch?v=u4FWXfgS8jw */
package com.bfm.LinkList;

import com.way.hackerRank.ListNode;

public class IntersectionOfTwoLinkList {

	public static void main(String[] args) {
		ListNode head1 = new ListNode(2);
		ListNode temp = head1;
		RemoveNthNodeFromLast obj = new RemoveNthNodeFromLast();
		obj.add(temp, 4);
		obj.add(temp, 6);
		obj.add(temp, 8);
		obj.add(temp, 10);
		obj.add(temp, 12);
		//obj.display(temp);
		
		ListNode head2 = new ListNode(1);
		ListNode temp2 = head2;
		obj.add(temp2, 3);
		obj.add(temp2, 5);
		obj.add(head, x);
		obj.add(temp2, 8);
		obj.add(temp2, 10);
		obj.add(temp2, 12);
		//obj.display(head2);
		IntersectionOfTwoLinkList ob = new IntersectionOfTwoLinkList();
		ListNode t = ob.intersectio(head1,head2);
		System.out.println("intersection point");
		obj.display(t);

	}
	
	public ListNode intersectio(ListNode head1, ListNode head2){
		if(head1 == null || head2 == null)
			return null;
		ListNode a = head1;
		ListNode b =head2;
		while(a !=b ){
			a = a == null ? head2 : a.next;
			b = b == null ? head1 : b.next;
		}
		return a;
	}
	
	


}

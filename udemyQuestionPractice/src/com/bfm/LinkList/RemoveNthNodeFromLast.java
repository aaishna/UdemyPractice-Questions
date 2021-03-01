package com.bfm.LinkList;

import com.way.hackerRank.ListNode;

public class RemoveNthNodeFromLast {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode temp = head;
		RemoveNthNodeFromLast obj = new RemoveNthNodeFromLast();
		obj.add(temp, 2);
		obj.add(temp, 3);
		obj.add(temp, 4);
		obj.add(temp, 5);
		obj.display(temp);
		ListNode t = obj.removeNthFromEnd(head, 1);
		System.out.println("deleted node ");
		obj.display(t);
	}
	public void add(ListNode head, int x){
		
		while(head.next!=null){
			head=head.next;
		}
		head.next = new ListNode(x);
		
	}
	
	public void display(ListNode head){
		
		while(head!=null){
			System.out.println(head.val);
			head= head.next;
		}		
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
       
		ListNode start = new ListNode(0);
		ListNode fast = start;
		start.next = head;
		for(int i=1; i<=n ;i++){
			fast= fast.next;
		}
		while(fast.next!=null){
			start = start.next;
			fast = fast.next;
		}
		start.next = start.next.next;
		return head;
    }
    
    
}

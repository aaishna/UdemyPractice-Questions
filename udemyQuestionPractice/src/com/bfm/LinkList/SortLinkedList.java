package com.bfm.LinkList;

import com.way.hackerRank.ListNode;

public class SortLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(3);
		ListNode temp = head;
		RemoveNthNodeFromLast obj = new RemoveNthNodeFromLast();
		obj.add(temp, 6);
		obj.add(temp, 1);
		obj.add(temp, 5);
		obj.add(temp, 4);
		obj.add(temp, 2);
		obj.display(temp);
		SortLinkedList ob = new SortLinkedList();
		ListNode t = ob.mergeSort(head);
		System.out.println("after sort");
		obj.display(t);

	}
	
	public ListNode mergeSort(ListNode head) {
		if(head==null || head.next == null)
			return head;
		ListNode mid = middle(head);
		ListNode secondHalf = mid.next;
		mid.next = null;
		return merge(mergeSort(head), mergeSort(secondHalf));
	}
	
	
	public static ListNode middle(ListNode head) {
		if(head == null) {
		      return null;
		}
		ListNode slow = head;
		ListNode fast = head.next;
		while(fast !=null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	

	ListNode merge(ListNode a, ListNode b){
		ListNode temp = new ListNode();
		ListNode start = temp;
		while(a!=null && b!=null){
			if(a.val< b.val){
				temp.next = a;
				a=a.next;
			}else{
				temp.next = b;
				b= b.next;
			}
			temp = temp.next;
		}
		 temp.next = (a == null) ? b : a;
		 return start.next;
	}


}

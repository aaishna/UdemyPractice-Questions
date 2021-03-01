package com.bfm.LinkList;

import com.way.hackerRank.ListNode;

public class Merge2LinkListResultSorted {

	public static void main(String[] args) {
		ListNode head1 = new ListNode(2);
		ListNode temp = head1;
		RemoveNthNodeFromLast obj = new RemoveNthNodeFromLast();
		obj.add(temp, 4);
		obj.add(temp, 6);
		obj.add(temp, 8);
		obj.add(temp, 10);
		obj.add(temp, 12);
		obj.display(temp);
		System.out.println("Second List");
		ListNode head2 = new ListNode(1);
		obj.add(head2, 3);
		obj.add(head2, 5);
		obj.add(head2, 7);
		obj.add(head2, 9);
		obj.add(head2, 11);
		obj.display(head2);
		Merge2LinkListResultSorted ob = new Merge2LinkListResultSorted();
		ListNode t = ob.mergeList(head1,head2);
		System.out.println("after sort");
		obj.display(t);

	}
	
	public ListNode mergeList(ListNode head1, ListNode head2){
		ListNode t1 = mergeSort(head1);
		ListNode t2 = mergeSort(head2);
		return merge(t1,t2);
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

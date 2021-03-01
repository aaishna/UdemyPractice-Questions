package com.bfm.LinkList;

import com.way.hackerRank.ListNode;

public class RotateListClockwiseByKthNode {

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
		RotateListClockwiseByKthNode ob = new RotateListClockwiseByKthNode();
		ListNode x = ob.rotateClockwise(2,head);
		System.out.println("rotate");
		obj.display(x);

	}



	public ListNode rotateClockwise(int k, ListNode node) {
		if(node == null || k < 0) {
			return node;
		}

		int s = size(node);
		k = k % s;

		if(k == 0) {
			return node;
		}

		ListNode tmp = node;
		int i = 1;

		while(i < s - k) {
			tmp = tmp.next;
			i++;
		}

		ListNode temp = tmp.next;
		ListNode head = temp;
		tmp.next = null;

		while(temp.next != null) {
			temp = temp.next;
		}

		temp.next = node;

		return head;
	}
	

	int size(ListNode head){
		int s=0;
		while(head!=null){
			head = head.next;
			s = s+1;
		}
		return s;
	}

}

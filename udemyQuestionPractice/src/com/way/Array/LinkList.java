package com.way.Array;

public class LinkList {
	Node head=null;
	Node tail=null;
	int size=0;
	class Node{
		int item;
		Node next;
		Node prev;
		public Node(int x, Node next, Node prev){
			this.item=x;
			this.next = next;
			this.prev = prev;
		}
	}
	public void addFirst(int item){
		Node temp = new Node(item,head,null);
		if(head!=null){
			temp.next=head;
			head.prev=temp;
		}
		head=temp;
		if(tail==null)
			tail=temp;
		size++;
	}
	
	public void addLast(int item){
		Node temp = new Node(item,null,tail);
		if(head!=tail){
			tail.next =temp;
			temp.prev=tail;
		}		
		tail=temp;
	}
	
	public void display(){
		Node temp=head;
		while(head!=null){
			System.out.println("  "+head.item);
			head=head.next;
		}
		head=temp;
	}

	public static void main(String[] args) {
		LinkList obj=new LinkList();
		obj.addFirst(10);
		obj.addFirst(30);
		obj.addLast(50);
		obj.display();
	}
	
}

 

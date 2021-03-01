package com.way.Array;

public class QueueImpl {
	int front;  // remove from front
	int rear; // insert from rear
	int arr[];
	int count,size;
	public QueueImpl(int size){
		this.size=size;
		arr= new int[size];
		front=rear=0;
		count=-1;
	}
	
	public void insert(int item){
		if(!isFull()){
			if(rear==count)
				rear=0;
			arr[rear]=item;
			rear=rear+1;
			count=count+1;
		}
	}
	public int remove(){
		if(!isEmpty()){
			if(front==size)
				front=0;
			int item=arr[front];
			front=front+1;
			count=count-1;
			return item;
		}
		return -1;
	}
	public boolean isFull(){
		if(count==size-1)
			return true;
		return false;
	}
	public boolean isEmpty(){
		if(count==-1)
			return true;
		return false;
	}
	public void display(){
		if(!isEmpty()){
			for(int i=front; i<rear;i++){
				System.out.println(" items are "+arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		QueueImpl obj=new QueueImpl(10);
		obj.insert(1);
		obj.insert(12);
		obj.insert(11);
		obj.insert(17);
		obj.insert(15);
		obj.display();
		System.out.println("removed item "+obj.remove());
		obj.display();

	}

}

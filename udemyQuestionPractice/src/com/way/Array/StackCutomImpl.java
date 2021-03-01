package com.way.Array;

public class StackCutomImpl {

	private int size;
	private int top=-1;
	private int[] arr;
	public StackCutomImpl(int size){
		this.size=size;
		arr = new int[size];
	}
	
	public boolean isFull(){
		if(top==size-1)
			return true;
		return false;
	}
	public boolean isEmpty(){
		if(top==-1)
			return true;
		return false;
	}
	public void push(int item){
		if(!isFull()){
			top=top+1;
			arr[top]=item;			
		}else{
			System.out.println("stack is full");
		}
	}
	public void pop(){
		int item;
		if(!isEmpty()){
			item=arr[top];
			top=top-1;
			System.out.println("deleted item "+item);
		}else{
			System.out.println("stack is empty");
		}
	}
	public void display(){
		int temp=top;
		if(!isEmpty()){
			while(top!=-1){
				System.out.println(arr[top]);
				top=top-1;
			}
			top=temp;
		}
	}
	public static void main(String[] args) {
		StackCutomImpl obj=new StackCutomImpl(10);
		obj.push(10);
		obj.push(200);
		obj.push(30);
		obj.push(40);
		obj.display();
		obj.pop();
		obj.display();
	}

}

// can also expand size in case of overflow using Array.copy method

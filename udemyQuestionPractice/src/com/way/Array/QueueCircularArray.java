package com.way.Array;

/* insert from rear
 * remove from front
 */
public class QueueCircularArray {
	int size=5;
	int count=-1;
	int front=0,rear=-1;
	int[] arr;
	public static void main(String[] args) {
		QueueCircularArray obj=new QueueCircularArray();
		obj.enque(10);
		obj.enque(20);
		obj.enque(30);
		obj.enque(40);
		obj.enque(50);
		obj.deque();
		obj.deque();
		obj.enque(10);
		obj.enque(20);
		obj.enque(10);
		obj.enque(20);
		obj.show();

	}
	public QueueCircularArray(){
		arr = new int[size];
	}
	
	public void enque(int item){
		if(!isFull()){
			rear=rear+1;
			arr[rear%size]=item; //0 % 5 = 0, 1 % 5 =1 .. 4 % 5 =4 , 5 % 5 =0
			count=count+1;
			return;
		}
		System.out.println("Sorry Overflow ");
		
	}
	public void deque(){
		if(!isEmpty()){
			System.out.println("deleted item "+arr[front]);
			front=(front+1)%size;
			count=count-1;
			return;
		}
		System.out.println("Sorry Underflow ");
	}
	public boolean isFull(){
		if(size==count+1)
			return true;
		return false;
		
	}
	public boolean isEmpty(){
		if(count==0)
			return true;
		return false;
		
	}
	public void show(){
		for(int i=0;i<=count;i++){
			System.out.println(arr[(front+i)%size]);
		}
	}
	

}

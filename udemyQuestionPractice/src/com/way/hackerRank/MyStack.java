package com.way.hackerRank;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class MyStack {
	
	Queue<Integer> q = new LinkedList<>();
    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	 q.add(x);
    	for(int i=0; i<q.size()-1; i++){
    		int m = q.poll();
    		q.add(m);
    	}
       
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return q.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
    
    public void display() {
    	Iterator<Integer> itr = q.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
    	
    }
    public static void main(String[] args){
    	MyStack obj = new MyStack();
    	obj.push(1);
    	obj.push(2);
    	System.out.println(obj.top());
    	System.out.println(obj.pop());
    	
    	//obj.pop();
    	//obj.top();
    	System.out.println("is empty "+obj.empty());
    	//obj.display();
    	/*while(!obj.empty()){
    		System.out.println(obj.pop());
    	}*/
    }
}

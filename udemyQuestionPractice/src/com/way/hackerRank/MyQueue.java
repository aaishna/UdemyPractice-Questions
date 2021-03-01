package com.way.hackerRank;

import java.util.Iterator;
import java.util.Stack;

class MyQueue {

    Stack<Integer> stk = new Stack<>();
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    	Stack<Integer> temp = new Stack<Integer>();
        while(!stk.empty()){
            temp.push(stk.pop());
        }
        stk.push(x);
        while(!temp.empty()){
        	stk.push(temp.pop());
        }
       
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	for(int i = 1; i<stk.size(); i++){
    		stk.add(stk.pop());
    	}
       return  stk.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return stk.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stk.isEmpty();
    }
    
    public void display() {
        Iterator<Integer> itr = stk.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
    }
    
    public static void main(String[] args) {
    	MyQueue obj = new MyQueue();
    	obj.push(10);
    	obj.push(20);
    	obj.push(30);
    	obj.push(40);
    	while(!obj.empty())
    		System.out.println(obj.pop());

	}
}

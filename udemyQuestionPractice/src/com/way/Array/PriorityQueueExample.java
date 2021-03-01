package com.way.Array;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(3);
		pq.add(7);
		pq.add(9);
		pq.add(1);
		pq.add(4);
		/*while(!pq.isEmpty()){
			System.out.println(pq.remove());
		}*/
		Iterator itr=pq.iterator();
		System.out.println("original array ");
		while(itr.hasNext()){
			System.out.println(pq.poll());	
		}
		/*System.out.println("after manipulation array ");
		System.out.println(pq.peek());
		System.out.println(pq.remove());
		System.out.println(pq.poll());
		itr=pq.iterator();
		System.out.println("after manipulation array ");
		while(itr.hasNext()){
			System.out.println(itr.next());	
		}*/

	}

}

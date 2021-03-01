package com.way.Array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustomComparator {

	public static void main(String[] args) {
		Comparator<String> comp = new Comparator<String>(){
			@Override
			public int compare(String s1, String s2){
				return s1.length() - s2.length();
			}
		};
		
		PriorityQueue<String> pq= new PriorityQueue<>(comp);
		pq.add("Aaishna");
		pq.add("singhal");
		pq.add("aaish");
		pq.add("xyz");
		pq.add("abc");
		while(!pq.isEmpty()){
			System.out.println(pq.poll());
		}

	}

}

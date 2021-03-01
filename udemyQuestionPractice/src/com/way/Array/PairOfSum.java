package com.way.Array;

import java.util.HashMap;
import java.util.Map;

public class PairOfSum {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 5, 4, 3, 2 };
		int sum = 6;
		boolean p = presentPair(arr, sum);
		System.out.println("Is Present "+p);
	}

	static boolean presentPair(int[] arr, int sum) {
		Map<Integer,Integer> compliment = new HashMap<Integer,Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (compliment.containsKey(arr[i])) {
				compliment.put(arr[i], compliment.get(arr[i])+1);
				//System.out.println(arr[i]);
				//System.out.println(i);
				//return true;
			}
			compliment.put(sum - arr[i],0);
		}
		for(int i=0;i<arr.length;i++){
			System.out.println("key is "+arr[i]+ " value are "+ compliment.get(arr[i]));
		}
		return false;
	}

}

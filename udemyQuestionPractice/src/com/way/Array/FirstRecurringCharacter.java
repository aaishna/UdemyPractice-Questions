package com.way.Array;

import java.util.HashMap;

public class FirstRecurringCharacter {

	public static void main(String[] args) {
		int arr[]={1,2,3,1,4,2,4};
		System.out.println("found "+find(arr));
	}
	
	public static int find(int[] arr){
		//Hashtable<Integer,Integer> hash =new Hashtable<>();
		HashMap<Integer,Integer> hash =new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(hash.containsKey(arr[i])){			
				return arr[i];
			}else{
				hash.put(arr[i], 0);
			}
		}
		return 0;
	}

}
// O(n) complexity
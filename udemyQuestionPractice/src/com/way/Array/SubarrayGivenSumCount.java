package com.way.Array;

import java.util.ArrayList;
import java.util.HashMap;

public class SubarrayGivenSumCount {

	public static void main(String[] args) {
		int[] arr = {3,4,7,2,-3,1,4,2};
		int sum = 7;
		
		SubarrayGivenSumCount obj = new SubarrayGivenSumCount();
		int count = obj.find(arr,sum);
		System.out.println(count);

	}
	public int find(int[] arr, int sum){
		int s=0, count=0;
		int diff = 0;
		
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0, 1);
		for(int i=0; i<arr.length; i++){
			s= s+ arr[i];
			diff = s-sum;
			
			if(map.containsKey(diff))
			{
				count = count + map.get(diff);
				
			}
			map.put(s, map.getOrDefault(s, 0)+1);
		
		}
		return count;
		
		
	}

}

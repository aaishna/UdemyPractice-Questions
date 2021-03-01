package com.way.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

	public static void main(String[] args) {
		TwoSum pb = new TwoSum();
		int[] arr = {-1,1,2,-1,-2};
		List<List<Integer>> res= pb.twoPair(arr);
		System.out.println(res.toString());
	}
	
	public List<List<Integer>> twoPair(int[] arr){
		List<List<Integer>> re = new ArrayList<>();
		int low = 0, high =arr.length-1;
		int sum = 0;
		Arrays.sort(arr);
		while(low<high){
			sum = arr[low] + arr[high];
			if(sum<0)
				low++;
			else if(sum > 0)
				high--;
			else if(sum == 0){
				List<Integer> l = new ArrayList<>();
				l.add(arr[low]);
				l.add(arr[high]);
				re.add(l);
				low++;
				high--;
			}
		}
		return re;
	}

}

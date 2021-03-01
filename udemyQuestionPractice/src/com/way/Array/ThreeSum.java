package com.way.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		ThreeSum obj = new ThreeSum();
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> t = obj.threeSum(nums);
		System.out.println(t.toString());
	}
	
	 public List<List<Integer>> threeSum(int[] nums) {
		 	int sum=0;
		 	
		 	int low=0, high=0;
		 	Set<List<Integer>> l = new HashSet<>();                   
		 	
		 	Arrays.sort(nums);
	        for(int i=0; i<nums.length-2; i++){
	        	low=i+1;  //j
	        	high=nums.length-1;  //k
	        	
	        	while(low<high){
	        		sum = nums[low] + nums[high];
	        		if(sum  > -nums[i])
	        			high--;
	        		else if(sum < -nums[i])
	        			low++;
	        		else if(sum == -nums[i]){
	        			
	        			l.add(Arrays.asList(nums[i],nums[low],nums[high]));
	        			low++;
	        			high--;
	        		}
	        	}
	        	
	        	
	        }
	        return new ArrayList<>(l);
	 }
	
	

}

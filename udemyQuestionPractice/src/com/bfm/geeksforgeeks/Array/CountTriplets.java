package com.bfm.geeksforgeeks.Array;

import java.util.Arrays;

public class CountTriplets {

	public static void main(String[] args) {
		int[] arr = {2,3,4};
		CountTriplets obj = new CountTriplets();
		obj.count(arr);

	}
	
	public void count(int[] arr){
		int s=0,c=0;
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++){
			s= arr[i];
			for(int j=i+2 ; j<arr.length; j++){
				if(arr[j] == arr[j-1]+s){
					c=c+1;
				}
			}
		}
		System.out.println(c);
	}

}

package com.way.Array;

import java.util.HashMap;

public class KthSmallest {
	static int l = 0;

	public static void main(String[] args) {
		int[] arr = { 2,5,1,8,3};
		KthSmallest obj = new KthSmallest();
		obj.sort(0,arr.length-1,arr,3);
		obj.display(arr);
		
	}
	public void display(int[] arr){
		System.out.println("sorted array ");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public void sort(int low, int high,int[] arr,int k){
		if(low<high){
			int s = pivot(low,high,arr);
			if(k == s)
				System.out.println(k+" element is : "+arr[s]);
			else if(k<s)
				sort(low,s-1,arr,k);
			else
				sort(s+1,high,arr,k);
		}
		
		
	}
	
	public int pivot(int begin, int end,int[] arr){
		int i=begin-1;
		int p = arr[end];
		for(int j=begin; j<end; j++){
			if(arr[j]<p){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] =temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] =temp;
		return i+1;
	}

}

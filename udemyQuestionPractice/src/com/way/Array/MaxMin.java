package com.way.Array;

public class MaxMin {

	public static void main(String[] args) {
		int[] arr = { 2,5,1,8,3};
		
		MaxMin obj = new MaxMin();
		obj.find(arr);
	}
	
	public void find(int[] arr){
		int min=arr[0];
		int max= 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("min is "+min+"  max is "+max);
	}

}

package com.bfm.sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {2,1,4,6,3};
		QuickSort s= new QuickSort();
		s.sort(0, arr.length-1, arr);
		for(int i=0; i< arr.length; i++){
			System.out.println(arr[i]);
		}

	}
	
	public void sort(int low, int high, int[] arr){
		if(low<high){
			int s= pivot(low,high,arr);
			sort(low,s-1,arr);
			sort(s+1,high,arr);
		}
	}
	
	public int pivot(int begin, int end, int[] arr){
		int pivot = arr[end];
		int i =begin-1;
		for(int j=begin; j<end; j++){
			if(arr[j] <= pivot){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] =temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = temp;
		return i+1;
	}

}

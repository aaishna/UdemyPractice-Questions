package com.way.Array;

public class InsertSorted {

	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		print(arr, arr.length - 1);
		System.out.println("After insertion 3 ");
		insert(3,arr);
		print(arr, arr.length - 1);
		//int r = search(3,arr,0,arr.length-1);
		//System.out.println("found " +r);
		System.out.println("After deletion 3 ");
		int n=delete(3,arr,arr.length-1);
		print(arr, n);
		reverse(arr);
		System.out.println("reverse array ");
		print(arr, n);

	}
	public static void reverse(int[] arr){
		int start = 0;
		int end = 3;
		int temp;
		while(start < end){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start = start +1;
			end = end-1;
		}
	}
	
	public static void insert(int key,int[] arr){
		int n = 4;
		int i;
		for(i=n-1; i >=0 && arr[i] > key; i--){
			arr[i+1] = arr[i];
			
		}
		arr[i + 1] = key;
		
	}
	public static int search(int key,int[] arr, int low, int high){
		int mid = (low+high)/2;
		
		if(key == arr[mid])
			return mid;
		if(key < arr[mid])
			return search(key,arr,low, mid -1);
		return search(key,arr,mid+1,high);
		
	}
	
	public static int delete(int key,int[] arr, int n){
		int mid = search(3,arr,0,arr.length-1);
		
			for(int i=mid; i< n; i++){
				
					arr[i] = arr[i+1];
				
			}
		
		return n-1;
	}
	public static void print(int[] arr, int n){
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}

}

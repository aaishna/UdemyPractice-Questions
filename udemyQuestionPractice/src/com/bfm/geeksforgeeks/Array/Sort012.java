package com.bfm.geeksforgeeks.Array;

public class Sort012 {

	public static void main(String[] args) {
		int[] arr = {1,0,0,1,2,0};
		Sort012 obj = new Sort012();
		obj.sort(arr);
	}
	public void sort(int[] arr){
		int low=0,high=arr.length-1, mid=0;
		while(mid<=high){
			if(arr[mid] == 0){
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				mid++;
				low++;
			}
			else if(arr[mid] == 1){
				mid++;
			}
			else if(arr[mid] == 2){
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] =temp;
				high--;
			}
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
	}

}

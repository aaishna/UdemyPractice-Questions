package com.way.Array;

public class LeaderElement {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 3, 1, 3};
		
		int temp = 0;
		/*for(int i = arr.length - 1; i>=0; i--){
			
			if(temp < arr[i])
				temp = arr[i];
			//if(arr[i] >= temp)
				//System.out.println(arr[i]);
			
		}*/
		int res = 0;
		for(int i=0 ; i<arr.length ; i++)
			res = res ^ arr[i];
		
		System.out.println(res);

	}

}

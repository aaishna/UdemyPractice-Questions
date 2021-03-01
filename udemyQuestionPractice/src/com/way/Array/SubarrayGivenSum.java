package com.way.Array;

public class SubarrayGivenSum {

	public static void main(String[] args) {
		int[] arr = {1,2,3,7,5};
		int sum = 12;
		int l = arr.length;
		SubarrayGivenSum obj = new SubarrayGivenSum();
		int[] subArr = obj.find(arr,sum,l);
		for(int i=0; i<subArr.length; i++)
			System.out.println(subArr[i]);

	}
	public int[] find(int[] arr, int sum, int l){
		int s= 0;
		int j=0;
		int k=0;
		int i=0;
		int[] a = new int[5];
		
		while(i<arr.length){
			s= s+ arr[i];
			a[k] = arr[i];
			k++;
			if(s==sum){
				
				return a;
			}	
			else if(s>sum){
				for(int c=0; c<a.length; c++){
					a[c]=0;
				}
				k=0;
				s=0;
				i=j+1;
			}else
				i++;
		}
		return a;
	}

}

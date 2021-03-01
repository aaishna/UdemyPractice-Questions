package com.way.Array;

public class RemoveDuplicateSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,10,10,12};
		System.out.println("length is "+arr.length);
		int l = removeDuplicates(arr);
		System.out.println("length is "+l);

	}
	public static int removeDuplicates(int[] nums){
		int p1;
		int p2;
		int i=0;
		int j=1;
		int len = nums.length;
			while(len!=0){
			p1= nums[i];
			p2 = nums[j];
			if(p1 == p2){
				j++;		
			}else{
				i++;
			}
			len--;
		}
		
		return i+1;
		
	}

}

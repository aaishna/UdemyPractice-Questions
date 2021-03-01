package com.way.Array;

public class Median2SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,4};
		int[] arr2 = {2,5};
		Median2SortedArray obj = new Median2SortedArray();
		double d=obj.findMedianSortedArrays(arr1, arr2);
		System.out.println(d);

	}
	
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 int l=0;
		 int k=0;
		 int big=0;
		 int[] arr = new int[nums1.length + nums2.length];
		 if(nums1.length < nums2.length){
			 l=nums1.length;
			 big=nums2.length;
		 }else {
			 l= nums2.length;
			 big=nums1.length;
		 }
			 
		 for(int i=0; i<l; i++){
			 if(nums1[i] < nums2[i])
				 arr[k] = nums1[i];
			 else
				 arr[k] = nums2[i];
			 k++;
		 }
		 if(nums1.length > nums2.length)
			 for(int i = k; i< big; i++){
				 arr[k] = nums1[i];
			 }
		 else
			 for(int i = k; i< big; i++){
				 arr[k] = nums2[i];
			 }
		 
		 int len = arr.length;
		 double median =0.0;
		 
		 if(len%2 != 0 )
			 median = arr[len/2];
		 else{
			 int s= len/2;
			 int a=arr[s/2];
			 int b=arr[(s/2)+1];
			 median = (a+ b)/2;
		 }
	      return median;  
	 }

}

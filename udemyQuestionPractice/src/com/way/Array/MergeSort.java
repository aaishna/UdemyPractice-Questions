package com.way.Array;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] array = {6,3,9,20,44,1,8,3,9,45};
		MergeSort ms= new MergeSort();
		int l=0;
		int r=array.length;
		ms.sort(array,l,r);

		
	}
	public void sort(int[] arr, int l, int r){
		//int m;
		if(l<r){
			int m=(l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			
			merge(arr,l,m,r);
		}
	}
	

	public static int[] merge(int[] arr, int l, int m, int r){
		int n1= (m-l)/2;
		int n2=r-m;
		int[] l1= new int[n1];
		int[] l2= new int[n2];
		int[] merge = new int[n1+n2];
		for(int i=0;i<n1;i++){
			l1[i]=arr[i];
		}
		for(int i=0;i<n2;i++){
			l2[i]=arr[i];
		}
		int i=0,j=0,k=0;
		while(i<n1 && j<n2){
			if(l1[i]<l2[j]){
				merge[k]=l1[i];
				i++;
			}else{
				merge[k]=l2[j];
				j++;
			}
				k++;
		}
		while(i<n1){
			merge[k]=arr[i];
			i++;
			k++;
		}
		while(j<n2){
			merge[k]=arr[j];
			j++;
			k++;
		}
		for(int k1=0;k1<merge.length;k1++){
			//System.out.println(merge[k1]);
		}
		return merge;

	}
}

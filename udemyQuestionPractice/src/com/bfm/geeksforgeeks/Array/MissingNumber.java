package com.bfm.geeksforgeeks.Array;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,10};
		MissingNumber obj = new MissingNumber();
		int k = obj.miss(arr, 10);
		System.out.println(k);
	}
	public int miss(int arr[], int n) {
        // Your Code Here
        int c=1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != c)
                return c;
            c= c+1;
        }
        return -1;
    }

}

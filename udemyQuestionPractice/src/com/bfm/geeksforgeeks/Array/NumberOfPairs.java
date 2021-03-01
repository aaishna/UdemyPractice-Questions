package com.bfm.geeksforgeeks.Array;

public class NumberOfPairs {

	public static void main(String[] args) {
		int[] arrX = {2,3,4,5};
		int[] arrY = {1,2,3};
		int count=0;
		for(int i = 0; i< arrX.length; i++){
			for(int j=0; j<arrY.length; j++){
				if(Math.pow(arrX[i], arrY[j]) > Math.pow(arrY[j], arrX[i])){
					count = count+1;
				}
			}
		}
		System.out.println(count);

	}

}

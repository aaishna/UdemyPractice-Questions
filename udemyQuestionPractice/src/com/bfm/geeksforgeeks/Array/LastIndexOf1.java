package com.bfm.geeksforgeeks.Array;

public class LastIndexOf1 {

	public static void main(String[] args) {
		String s="0001";
		int i=s.length()-1;
		
		while(i>=0){
			if(s.charAt(i) =='1')
				System.out.println(i);
			i--;
		}
	}

}

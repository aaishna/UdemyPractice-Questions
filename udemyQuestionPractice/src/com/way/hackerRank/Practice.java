package com.way.hackerRank;

public class Practice {

	public static void main(String[] args) {
		String s="abcbag";
		String pal = longestPalindrome(s);
		System.out.println(pal);

	}
	public static String longestPalindrome(String s){
		
		int start=0;
		int end=0;
		int left,right;
		char c;
		//int[] arr = new int(10);

		for(int i = 0 ; i < s.length() ; i++){
			left=i;
			right=i;
			c=s.charAt(i);
			while(left >= 0 && s.charAt(left) == c){
				left--;
			}
			while(right < s.length() && s.charAt(right) == c){
				right++;
			}
			while(left >= 0 && right < s.length()){
				if(s.charAt(left) != s.charAt(right))
					break;
				left--;
				right++;
			}
			left = left +1;
			if(end - start < right - left){
				start = left;
				end = right;
			}
		}
		return s.substring(start,end);
	}

}

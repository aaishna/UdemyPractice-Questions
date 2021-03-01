package com.bfm.stringPrac;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartioning2 {
	static List<List<String>> res = new ArrayList<>();
	public static void main(String[] args) {
		List<List<String>>r = partition("aab");
		System.out.println(r.toString());
	}

		public static List<List<String>> partition(String s) {
			List<List<String>> res = new ArrayList<>();
			backTrack(s,res,new ArrayList());
			return res;
		}
		    

		public static void backTrack(String s, List<List<String>> res, List<String> temp){
			if(s.length()==0){
				res.add(new ArrayList(temp));	
			}
			for(int i=0; i<s.length(); i++){
				String leftpar = s.substring(0,i+1);
				if(isPalindrome(leftpar)){
					temp.add(leftpar);
					backTrack(s.substring(i+1), res, temp);
					temp.remove(temp.size()-1);
				}
			}
		}
		
		

		public static boolean isPalindrome(String s){
			int left=0;
			int right = s.length()-1;
			if(left == right)
				return true;
			while(left<right){
				if(s.charAt(left) != s.charAt(right))
					return false;
				left++;
				right--;
			}
			
			return true;
		}
		
	
		

	}

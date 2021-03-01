package com.way.Array;

import java.util.Scanner;

class Solution{

	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		//int top=-1;
		int i=-1;
		boolean bool=false;
		while (sc.hasNext()) {
			String input=sc.next();
			
			int l=input.length();
			String[] stk = new String[l];
			char[] c = input.toCharArray();
			bool=false;
			for(int j=0;j<l;j++){
				if(input.charAt(j) == '{' || input.charAt(j) == '(' || input.charAt(j) == '['){
					stk[++i]=String.valueOf(input.charAt(j));
				}else if(input.charAt(j) == '}'){
					if(stk[i].equals("{"))
					bool=true; i=i-1;
				}else if(input.charAt(j) == ')'){
					if(stk[i].equals("("))
					bool=true; i=i-1;
				}else if(input.charAt(j) == ']'){
					if(stk[i].equals("["))
					bool=true; i=i-1;
				}
			}
			System.out.println(bool);
		}


	}
}

package com.bfm.exceptionPractice;

public class CheckFinally {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		int s= sum(a,b);
		System.out.println("a+b = "+s);

	}
	public static int sum(int a, int b){
		try{
			return a+b;
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("finally executed");
		}
		return 1;
	}

}

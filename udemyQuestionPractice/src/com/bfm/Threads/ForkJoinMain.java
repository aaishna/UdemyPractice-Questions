package com.bfm.Threads;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinMain {

	public static void main(String[] args) {
		int[] arr = {1,2,6,7,6,2,6,4,6,8};
		int x=6;
		ForkJoinPool pool = ForkJoinPool.commonPool(); 
		ForkJoinSearchTask t1 = new ForkJoinSearchTask(arr,0,arr.length-1,x);
		int res = pool.invoke(t1);
		System.out.printf("%d found  %d times ",x,res);

	}

}

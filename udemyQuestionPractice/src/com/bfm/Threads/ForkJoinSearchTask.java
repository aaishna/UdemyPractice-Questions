package com.bfm.Threads;

import java.util.concurrent.RecursiveTask;

public class ForkJoinSearchTask extends RecursiveTask<Integer>{
	int[] arr;
	int start,end,x;
	
	public ForkJoinSearchTask(int[] arr, int start, int end, int x){
		this.arr = arr;
		this.start = start;
		this.end = end;
		this.x = x;
	}
	@Override
	protected Integer compute() {
		System.out.println(Thread.currentThread().getName());
		int size = end-start+1;
		if(size>3){
			int mid = (start + end )/2;
			ForkJoinSearchTask t1 = new ForkJoinSearchTask(arr,start,mid,x);
			ForkJoinSearchTask t2 = new ForkJoinSearchTask(arr,mid,end,x);
			t1.fork();
			t2.fork();
			return t1.join() + t2.join();
		}
		else
			return processSearch();
	}
	
	public Integer processSearch(){
		int count=0;
		for(int i=start; i<end; i++){
			if(arr[i] == x)
				count++;
		}
		return count;
	}

}

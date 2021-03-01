package com.bfm.Threads;

import java.util.concurrent.Exchanger;

public class ExcahangerThreadClass implements Runnable{

	Exchanger exchanger = null;
	Object    object    = null;


	public ExcahangerThreadClass(Exchanger exchanger, Object object) {
		this.exchanger = exchanger;
		this.object = object;
	}

	public void run() {
		try {
			Object previous = this.object;

			this.object = this.exchanger.exchange(this.object);

			System.out.println(
					Thread.currentThread().getName() +
					" exchanged " + previous + " for " + this.object
					);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


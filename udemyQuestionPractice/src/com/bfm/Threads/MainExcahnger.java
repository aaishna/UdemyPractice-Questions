package com.bfm.Threads;

import java.util.concurrent.Exchanger;

public class MainExcahnger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exchanger exchanger = new Exchanger();

		ExcahangerThreadClass exchangerRunnable1 =
		        new ExcahangerThreadClass(exchanger, "A");

		ExcahangerThreadClass exchangerRunnable2 =
		        new ExcahangerThreadClass(exchanger, "B");

		new Thread(exchangerRunnable1).start();
		new Thread(exchangerRunnable2).start();
	}

}

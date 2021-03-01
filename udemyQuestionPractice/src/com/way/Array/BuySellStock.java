package com.way.Array;

public class BuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int profit = maxProfit(arr);
		System.out.println(profit);
	}
	
	 public static int maxProfit(int[] prices) {
		 if(prices.length == 0)
			 return 0;
		 
		 int min=prices[0], max=0, profit=0;
		 for(int i=0;i<prices.length ; i++){
			 if(min>prices[i])
				 min=prices[i];
			 if(max < prices[i]-min){
				 max = prices[i]-min;
				 profit = profit + max;
				 min = prices[i];
				 max = 0;
			 }
			 
		 }
		 return profit;
	 }

}

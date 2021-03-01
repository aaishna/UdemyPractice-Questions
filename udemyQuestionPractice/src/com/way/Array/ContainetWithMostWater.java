package com.way.Array;

public class ContainetWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  height = {4,3,2,1,4};
		ContainetWithMostWater obj = new ContainetWithMostWater();
		System.out.println(obj.maxArea(height));

	}
	
	public int maxArea(int[] height) {
	    int left = 0, right = height.length - 1;
		int maxArea = 0;

		while (left < right) {
			
			int min =Math.min(height[left], height[right]);
			int diff = right - left;
			maxArea = Math.max(maxArea, min * diff);
			
			if (height[left] < height[right])
				left++;
			else
				right--;
		}

		return maxArea;
	}

}

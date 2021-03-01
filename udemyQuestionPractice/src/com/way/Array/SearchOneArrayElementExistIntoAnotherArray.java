package com.way.Array;

import java.util.HashMap;
import java.util.Map;

public class SearchOneArrayElementExistIntoAnotherArray {

	public static void main(String[] args) {
		int arr1[] = new int[] {1,2,3,4,5,6};
		int arr2[] = new int[] {1,8,9};
		Map<Integer, Boolean> map=new HashMap<>();
		for(int i=0;i<arr1.length;i++){
			if(!map.containsKey(arr1[i])){
				map.put(arr1[i], true);
			}
		}
		boolean check=checkElementExist(arr2,map);
		System.out.println("element exist "+check);
	}
	static boolean checkElementExist(int[] arr2, Map<Integer, Boolean> map){
		for(int j=0;j<arr2.length;j++){
			if(map.containsKey(arr2[j])){
				return true;
			}
		}
		return false;
	}
}

//Time complexity o(a+b)
//Space Compexity o(a) as map takes arr1.length memory which is a.

// if we put two nested loops it will take time complexity o(a*b) -- not recommended for massive arrays
// space complexity o(1)

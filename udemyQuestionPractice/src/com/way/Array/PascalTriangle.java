package com.way.Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> gen = generate(5);
		
				System.out.println(gen.toString());
	
	}
	
	 public static List<List<Integer>> generate(int numRows)
		{
			List<Integer> row = new ArrayList<Integer>();
			List<List<Integer>> allRows = new ArrayList<List<Integer>>();
			for(int i = 0; i < numRows; i++ ){
				row.add(0,1);
				for(int j = 1; j < row.size() - 1; j++ ){
					row.set(j, row.get(j) + row.get(j + 1));
				}
				allRows.add(new ArrayList<Integer>(row));
			}
			return allRows;
		}

}

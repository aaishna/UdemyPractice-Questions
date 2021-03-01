package com.way.Array;

import java.util.ArrayList;

public class CustomArrayList {
	class Data{
		int age;
		String name;
	    public Data(int age, String name){
			this.age=age;
			this.name=name;
		}
		
	}

	public static void main(String[] args) {
		CustomArrayList cal=new CustomArrayList();
		String[] name={"abc","fgfh","jj","tyt"};
		int[] age={10,20,34,25};
		cal.addValues(name,age);

	}
	public void addValues(String[] name, int[] age){
		ArrayList<Data> al =new ArrayList<>();
		for(int i=0;i<name.length;i++){
			al.add(new Data(age[i],name[i]));
		}
	}

}

package com.way.hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MainEmployee {

	public static void main(String[] args) {
		//nt id, int age, String name, long salary)
		Employee e1=new Employee(1,20,"ash",89999l);
		Employee e2=new Employee(7,30,"ash",77839l);
		Employee e3=new Employee(2,25,"ash",33999l);
		Employee e4=new Employee(8,28,"ash",299999l);
		Employee e5=new Employee(3,29,"ash",677774l);
		List<Employee> list =new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		System.out.println("Employess in ascending order by their id");
		Comparator c = Collections.reverseOrder();
	    Collections.sort(list,c);
		//System.out.println(list);
		System.out.println(list);

	}

}

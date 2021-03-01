package com.way.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeComparable e1 = new EmployeeComparable(3, "abc",20000);
		EmployeeComparable e2 = new EmployeeComparable(4, "sss",40000);
		EmployeeComparable e3 = new EmployeeComparable(1, "ccc",10000);
		EmployeeComparable e4 = new EmployeeComparable(2, "bbbb",90000);
		List<EmployeeComparable> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		Collections.sort(list);
		System.out.println(list);
		
		
		Employee e11 = new Employee(3, "abc",20000);
		Employee e21 = new Employee(4, "sss",40000d);
		Employee e31 = new Employee(1, "ccc",10000);
		Employee e41 = new Employee(2, "bbbb",90000);
		List<Employee> list1 = new ArrayList<>();
		list1.add(e11);
		list1.add(e21);
		list1.add(e31);
		list1.add(e41);
		Collections.sort(list1,new EmployeeIdComparator());
		Collections.sort(list1,new EmployeeNameComparator());
		System.out.println(list1);
		
		
		
	}
	
	

}

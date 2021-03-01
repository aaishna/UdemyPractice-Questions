package com.way.hackerRank;
/*
 * how to use comparable interface
 */
public class Employee implements Comparable<Employee>{
	private int id;
	private int age;
	private String name;
	private long salary;
	
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public long getSalary() {
		return salary;
	}
	
	public Employee(int id, int age, String name, long salary){
		this.id=id;
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Employee o) {
		return this.id-o.id;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

}

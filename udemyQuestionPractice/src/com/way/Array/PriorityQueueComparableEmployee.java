package com.way.Array;

import java.util.PriorityQueue;

public class PriorityQueueComparableEmployee implements Comparable<PriorityQueueComparableEmployee>{

	private String name;
	private double salary;
	public PriorityQueueComparableEmployee(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PriorityQueueComparableEmployee other = (PriorityQueueComparableEmployee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PriorityQueueComparableEmployee [name=" + name + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		PriorityQueueComparableEmployee emp1 = new PriorityQueueComparableEmployee("Aaish", 1000);
		PriorityQueueComparableEmployee emp2 = new PriorityQueueComparableEmployee("Singhal", 20000);
		PriorityQueueComparableEmployee emp3 = new PriorityQueueComparableEmployee("xyz", 5000);
		PriorityQueueComparableEmployee emp4 = new PriorityQueueComparableEmployee("dfga", 9000);

		PriorityQueue<PriorityQueueComparableEmployee> pq= new PriorityQueue<>();
		pq.add(emp1);
		pq.add(emp2);
		pq.add(emp3);
		pq.add(emp4);

		while(!pq.isEmpty()){
			System.out.println(pq.poll());
		}
	}

	@Override
	public int compareTo(PriorityQueueComparableEmployee o) {
		if(this.salary > o.salary)
			return 1;
		else if(this.salary > o.salary)
			return -1;
		return 0;
	}

}

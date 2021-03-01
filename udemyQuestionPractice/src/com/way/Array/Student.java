package com.way.Array;

import java.util.HashMap;

public class Student {

	String id;
	public Student(String id){
		this.id=id;
	}
	public static void main(String[] args) {
		
		Student ob1=new Student("s1");
		Student ob2 =new Student("s2");
		HashMap<Student, String> map = new HashMap<Student, String>();
		map.put(ob1, "s1");
		map.put(ob2, "s2");
		System.out.println(map.get(new Student("s1")));
		System.out.println(ob1.equals(new Student("s1")));
		//System.out.println(ob1==(new Student("s1")));
		ob2=ob1;
		System.out.println(ob1==ob2);
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if (!(obj instanceof Student))
			return false;	
		if (obj == this)
			return true;
		return this.id.equals(((Student) obj).id);
	}
	
	
	

}



/* say two objects are*/

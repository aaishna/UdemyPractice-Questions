package com.way.hackerRank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Priorities  {
	List<Student> getStudents(List<String> events){

  PriorityQueue < Student > pq = 
  new PriorityQueue<Student>(
		  Comparator.comparing(Student::getCgpa).reversed()
		  .thenComparing(Student::getName)
		  .thenComparing(Student::getId)
		  );
  
  
		List<Student> students=new ArrayList<>();

		for(String event : events){
			Scanner sc=new Scanner(event);
			switch(sc.next()){
			case "ENTER": 
				
				String name=sc.next();
				System.out.println("name = "+name);
				
				float cgpa=sc.nextFloat();
				System.out.println("cgpa = "+cgpa);
				
				int id=sc.nextInt();
				System.out.println("id = "+id);
				Student s= new Student(id,name,cgpa);
				pq.add(s);
				break;
			case "SERVED": pq.poll();
				break;
			}
		}
		while(!pq.isEmpty()){
			students.add(pq.poll());
		}
		
		return students;

	}
	

}

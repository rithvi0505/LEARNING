package april.collection.sorting;

import java.util.*;

public class StudentApp {

	public static void main(String[] args) {
		
		Student st1=new Student(1,"Ayush",81.7F);
		Student st2=new Student(2,"Nishant",94.4F);
		Student st3=new Student(3,"Pankaj",56.6F);
		
		ArrayList<Student> al=new ArrayList();
		al.add(st1);
		al.add(st2);
		al.add(st3);
		
		System.out.println(al);
		
		//Now, how to sort these complex objects????
	}

}

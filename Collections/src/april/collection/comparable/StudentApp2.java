/*package april.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentApp2 implements Comparator<Student>{

	
	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.per>o2.per)
		{
			return 1;
		}
		else if(o1.per<o2.per)
		{
			return -1;
		}
		else
		
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st1=new Student(23,"Fedrik",45.0);
		Student st2=new Student(2,"Derek",41.8);
		Student st3=new Student(7,"Samuel",95.9);
		
		ArrayList<Student> al=new ArrayList();
		al.add(st1);
		al.add(st2);
		al.add(st3);
		
		System.out.println(al);
		
		StudentApp2 sta=new StudentApp2();
		Collections.sort(al,sta);
		System.out.println(al);

	}


}
*/

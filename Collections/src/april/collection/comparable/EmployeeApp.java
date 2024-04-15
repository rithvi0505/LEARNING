package april.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(3,"Anish",47000);
		Employee e2=new Employee(5,"Nitish",78000);
		Employee e3=new Employee(7,"Jitu",23000);
		
		ArrayList<Employee> al=new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Collections.sort(al);
		System.out.println(al);

	}

}

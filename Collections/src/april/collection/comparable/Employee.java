package april.collection.comparable;

public class Employee implements Comparable<Employee>{

	
	int empId;
	String name;
	int salary;
	
	public Employee(int empId, String name, int salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	
	
	
	@Override
	public int compareTo(Employee o) {
		
		if(this.salary>o.salary)
		{
			return 1;
		}
		else if(this.salary<o.salary)
		{
			return -1;
		}
		else
		return 0;
	}
	
	@Override
	public String toString()
	{
		return "Salary="+salary+" name="+name;
	}
	
	

}

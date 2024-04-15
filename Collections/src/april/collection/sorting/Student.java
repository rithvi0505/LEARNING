package april.collection.sorting;

public class Student {
	
	int roll;
	String name;
	float per;
	
	public Student(int roll, String name, float per)
	{
		this.roll=roll;
		this.name=name;
		this.per=per;
	}
	
	public String toString()	//we do this to print the objects in the form of String and not in the form of objects, which would not be readable
	{
		return roll+" "+name+" "+per;
	}

}

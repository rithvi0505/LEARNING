import java.util.Scanner;

public class Studentform {

	public static void main(String[] args) {
		System.out.println("Hello! Please fill the form!");
		while (true)
		{
		form();
		}
		
	}

	public static void form()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name ");
		String name=input.nextLine();
		System.out.println("enter your gender ");
		String gen=input.next();
	
		
		feed(name,gen);
		
	}
	
	public static void feed(String name, String gen)
	{
		String n=name;
		String g=gen;
		String t="male";
		String s="female";
		
		if(g.equals(t))
		{
			System.out.println("Congrats You are a perfect Male Candidate "+n);
		}
		else if (g.equals(s))
		{
			System.out.println("Congrats You are an excellent Female Candidate "+n);
		}
		else
		{
			System.out.println("Why?? Just why?? "+n);
		}
	}
}

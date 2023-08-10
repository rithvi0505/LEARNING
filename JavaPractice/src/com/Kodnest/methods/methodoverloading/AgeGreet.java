/*Write a Java Program to take name and year of birth as input from keyboard and greet the person with his name printed along with greeting message.
You should also print the age of the person after greeting.
Note: Greeting is a task...So ...Keep The Task In a Separate Method and let the method be of type- “ Type-3 “
I,e Method which accept the parameter and would not return the value.
Note2: Calculating age is also a task ..hence keep it in separate method of type – 4 I,e method should accept parameter and should return value
Sample input
Omkar
2020
Sample Output:
Hello Omkar …
Your are 3 years*/
package com.Kodnest.methods.methodoverloading;

import java.util.Scanner;

public class AgeGreet{

	public static void main(String[] args) {
		
		System.out.println("Enter your name:");
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		System.out.println("Enter your birth year");
		int a=scan.nextInt();
		scan.close();
		greet(name,a);              

	}
	
	public static void greet(String n, int a)         // Accepting parameters
	{
	
		
		int x=year(a);
		System.out.println("Hello "+n+". Welcome to Kodnest...your are "+x+" years old");
		// not returning any value

	}
	
	public static int year(int age)   // accepting parameters
	{
		return 2023-age;               // returning value
	}

}

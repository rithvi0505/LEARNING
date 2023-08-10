/*write a java program to take name as input from keyboard and greet the person with his name 
 * printed along with greeting message. 
 * note: greeting is a task so, keep the task in a separate method and let the method be of type3.
 * 
 * Sample Input: Omkar
 * Sample output: Hello Omkar.... How are you?
 */
package com.Kodnest.methods.methodoverloading;

import java.util.Scanner;

public class Greet {

	public static void main(String[] args) {
		
		System.out.println("Enter your name:");
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		scan.close();
		greet(name);               // Accepting parameters

	}
	
	public static void greet(String x)
	{
		
		System.out.println("Hello "+x+". Welcome to Kodnest!");
		// not returning any value

	}

}

package com.kodnest.august.control;

import java.util.Scanner;

public class Check {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your marks:");
		int marks=scan.nextInt();
		Checker(marks);
		scan.close();
		
	}
	
	
	
	public static void Checker(int marks) {
		
		System.out.println("welcome to Kodnest");
	
		if(marks>=80)
			{
			System.out.println("Welcome to Tech club");
			
			}
		
		}

}

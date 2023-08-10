package com.kodnest.august.controlconstructs;

import java.util.Scanner;

public class Employment {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Salary in LPA");
		int sal=scan.nextInt();
		System.out.println("'G' for governtment job\n'P' for private job:");
		String stat=scan.next();
		System.out.println("Hello Son!");
		
		if(sal>=3000000)
		{
			System.out.println("You are a rich person");
			
			if(stat.equals("G"))
			{
				System.out.println("Please marry my daughter");	
			}
		}
	}
}

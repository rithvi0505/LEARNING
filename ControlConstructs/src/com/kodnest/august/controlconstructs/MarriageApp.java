package com.kodnest.august.controlconstructs;

import java.util.Scanner;

public class MarriageApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter M for male and F for female");
		String gender=scan.nextLine();
		System.out.println("Enter your age");
		int age=scan.nextInt();
		
		if(gender.equals("M"))
		{
			if(age>=21)
			{
				System.out.println("You are eligible for marriage");
			}
			else
			{
				System.out.println("You are NOT eligible for marriage");
			}
		}
		else if(gender.equals("F"))
		{
			if(age>=18)
			{
				System.out.println("you are eligible for marriage");
			}
			else {
				System.out.println("you are NOT eligible for marriage");
			}
		}
		else
		{
			System.out.println("Other genders are not allowed to marry in India");
		}
	}

}

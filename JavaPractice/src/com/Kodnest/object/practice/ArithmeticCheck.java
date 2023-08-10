package com.Kodnest.object.practice;
import java.util.Scanner;

public class ArithmeticCheck {

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter trials");
		int t=scan.nextInt();
		
		while(t>0)
		{
			System.out.println("enter song time");
		    int X=scan.nextInt();
		    System.out.println("enter travel time");
		    int N=scan.nextInt();
		    
		    System.out.println(N/(3*X));
		    
		    t--;
		}
}
}

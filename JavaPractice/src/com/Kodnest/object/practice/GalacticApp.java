package com.Kodnest.object.practice;
import java.util.Scanner;



public class GalacticApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter numbers");
		
		long a=scan.nextLong();
		long b=scan.nextLong();
		long sum=galacticAddition(a,b);
		System.out.println(sum);
		
	}
	
	public static long galacticAddition(long num1,long num2)
	{
		return num1+num2;
	}

}

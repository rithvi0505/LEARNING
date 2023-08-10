package com.kodnest.practice.thursday;
import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int a=scan.nextInt();
		System.out.println(doubleTheNumber(a));
		
	}
	public static int doubleTheNumber(int num)
	{
		return 2*num;
	}

}




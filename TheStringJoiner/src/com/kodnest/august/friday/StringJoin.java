package com.kodnest.august.friday;
import java.util.Scanner;
public class StringJoin {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first name:");
		String str1=scan.next();
		System.out.println("Enter your second name:");
		String str2=scan.next();
		System.out.println(joinStrings(str1,str2));
		scan.close();
	}
	
	public static String joinStrings(String str1,String str2)
	{
		return str1 +" "+str2;
	}

}

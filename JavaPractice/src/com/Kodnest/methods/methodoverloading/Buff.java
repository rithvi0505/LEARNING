package com.Kodnest.methods.methodoverloading;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buff {

	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter your name");
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		
		String msg=bf.readLine();
		bf.close();
		System.out.println("Hi "+msg+"! This is a bufferedReader Checking.");
		

	}

}

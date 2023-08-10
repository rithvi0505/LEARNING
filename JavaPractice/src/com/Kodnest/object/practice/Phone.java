package com.Kodnest.object.practice;

public class Phone {
	
	String color;
	String brand;
	int cost;
	void call()
	{
		System.out.println("\n"+color+" "+brand+" "+"Calling "+" which is "+ "Rs."+cost+"/-");
	}
	void camera()
	{
		System.out.println(color+" "+brand+" "+"Capturing Image "+" which is "+ "Rs."+cost+"/-");
	}
	
	public Phone(String x, String y, int z)    //Constructor
	{
		color=x;
		brand=y;
		cost=z;
	} 

}

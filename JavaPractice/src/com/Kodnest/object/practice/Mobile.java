package com.Kodnest.object.practice;

public class Mobile {
	
	String brand;
	String color;
	int cost;
	
	public Mobile(String a, String b, int c)
	{
		brand=a;
		color=b;
		cost=c;
	}
	
	public Mobile()
	{
		brand="REDMI";
		color="blue";
		cost=16000;
	}
	
	public Mobile(String x)
	{
		brand=x;
	}
	public Mobile(int x)
	{
		brand="Apple";
		color="Gold";
		cost=x;
		
		
	}
	
	void allowToCall()
	{
		System.out.println(brand+" "+color+" worth "+cost+"/- is calling");
	}

}

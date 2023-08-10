package com.Kodnest.object.practice;

public class MobileIndustryStandards {
	
	String brand;
	String color;
	int cost;
	
	public MobileIndustryStandards(String brand,String color,int cost)
	{
		this.brand=brand;
		this.color=color;
		this.cost=cost;
	}
	
	void call()
	{
		System.out.println(brand+" "+color+" "+" worth "+cost+"/- is calling");
	}
}

package com.Kodnest.methods.methodoverloading;

public class FanApp {

	public static void main(String[] args) {
		
		Fan f1=new Fan();
		f1.wing=3;
		f1.cost=3000;
		f1.color="red";
		f1.brand="usha";
		Fan f2=new Fan();
		f2.wing=3;
		f2.cost=2000;
		f2.color="white";
		f2.brand="crompton";
		Fan f3=new Fan();
		f3.wing=2;
		f3.cost=5000;
		f3.color="black";
		f3.brand="havels";
		
		
		
		System.out.println(f1.wing+" "+f1.cost+" "+f1.color+" "+f1.brand+" \n"+f2.wing+" "+f2.cost+" "+f2.color+" "+f2.brand+"\n"+f3.wing+" "+f3.cost+" "+f3.color+" "+f3.brand);
		
		f1.rotate();
		f1.blow();
		f2.rotate();
		f2.blow();
		f3.rotate();
		f3.blow();
	}

}

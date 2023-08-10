package com.Kodnest.object.practice;

public class MobileApp {

	public static void main(String[] args) {
		
		Mobile m1=new Mobile("Nokia","Black",23000);
		m1.allowToCall();
		
		Mobile m2=new Mobile();
		m2.allowToCall();
		
		Mobile m3=new Mobile(87000);
		m3.allowToCall();
		
		Mobile m4=new Mobile("Samsung");
		m4.allowToCall();
	}

}

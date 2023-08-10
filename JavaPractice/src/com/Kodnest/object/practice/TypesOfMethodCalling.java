package com.Kodnest.object.practice;

public class TypesOfMethodCalling {     //method inside the same class, Static and non-static

	public static void main(String[] args) {
		
		method1();                      //static method- no need to make object
		
		TypesOfMethodCalling m=new TypesOfMethodCalling();
		m.method2();                                         //non static- need to make object as per Industry Standards
		
		TOMCDifferentClass.method3();                           //static method -no need to create object, just mention the class name it is in.
		
		TOMCDifferentClass m4=new TOMCDifferentClass();         //non-static -need to make object
		m4.method4();
		
		
	}
	public static void method1()        // static method
	{
		System.out.println("hello from method1");
	}
	
	void method2()                        //Non Static method
	{
		System.out.println("hello from non static method2");
	}

}

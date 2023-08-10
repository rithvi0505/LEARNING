/*Assume You Have A Fan Object.

And it has no_Of_Wings,color,cost, and brand.

Fan can rotate and it can blow_Air.

Your Task is to Create 3 fan objects access its data members and give the values to it . You should also print the data mambers on the console.

You should also access its member functions after printing data members on the console.

Note that : Fan Can Certainly Rotate But User Should Know Which Color Which Brand And How Many Wings Fan is Rotating and what is the cost of it .

If blow_Air is accessed then fan can certainly bow air but which color fan is blowing air, the user should know it.*/

package com.Kodnest.methods.methodoverloading;

public class Fan {
	
	int wing;
	int cost;
	String color;
	String brand;
	
	void rotate() {
		
		System.out.println(color+" "+brand+" with "+wing+" wings "+" worth "+cost+" is rotating");
		
	}

	void blow() {
		System.out.println(color+" "+brand+" with "+wing+" wings "+ "worth "+cost +" is blowing Air");
		
		
	}
	
}

package com.Kodnest.methods.methodoverloading;


import java.util.Scanner;

public class IRCTC {

	public static void main(String[] args) {
		
		TrainTicket book=new TrainTicket();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name:");
	
		book.passenger_name=scan.nextLine();
		System.out.println("Enter your age:");
		book.age=scan.nextInt();
		System.out.println("Enter train name:");
		book.train_name=scan.nextLine();
		scan.nextLine();
		System.out.println("Enter train date:");
		book.train_date=scan.nextInt();
		scan.close();
		book.confirmed();
		book.RAC();
		book.Waitlist();
			
	}

}

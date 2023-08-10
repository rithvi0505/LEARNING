package com.Kodnest.methods.methodoverloading;
import java.lang.Math;

public class TrainTicket {

	String passenger_name;
	int age;
	String train_name;
	int train_date;

	
	
		void confirmed()
		{
		System.out.println("Ticket Confirmed:"+passenger_name+" age "+age+" "+ train_name+" on "+train_date);
		
		}
	
		void RAC()
		{
		System.out.println("Ticket RAC:"+passenger_name+" age "+age+" "+ train_name+" on "+train_date);
		
		}
	
		void Waitlist()
		{
		System.out.println("Ticket Waiting List:"+passenger_name+" age "+age+" "+ train_name+" on "+train_date);
		
		}
	}




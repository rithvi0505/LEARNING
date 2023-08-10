package com.kodnest.august.friday;
import java.util.Scanner;

public class JourneyCal {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter speed");
		double speed=scan.nextDouble();
		System.out.println("enter time");
		double time=scan.nextDouble();
		JourneyCal dis=new JourneyCal();
		System.out.println(dis.distanceCal(speed,time));
	}
	public double distanceCal(double speed, double time)
	{
		return speed*time;
	}

}

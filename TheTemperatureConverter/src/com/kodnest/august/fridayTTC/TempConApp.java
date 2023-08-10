package com.kodnest.august.fridayTTC;
import java.util.Scanner;
public class TempConApp {

	public static void main(String[] args) {
		System.out.println("enter temperature in farhenheit");
		Scanner scan=new Scanner(System.in);
		double fr=scan.nextDouble();
		TempCon res=new TempCon();
		System.out.println(res.ConFTC(fr));
		
		
	}

}

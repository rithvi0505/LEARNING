package com.kodnest.august.controlconstructs;

import java.util.Scanner;

public class Score2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your score");
		int score=scan.nextInt();
		Grade2 g1=new Grade2();				//CALLING OF NON-STATIC METHOD by creating object
		g1.grades(score);
		scan.close();
	}

}

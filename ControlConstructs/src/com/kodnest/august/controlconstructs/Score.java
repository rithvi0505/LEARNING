package com.kodnest.august.controlconstructs;

import java.util.Scanner;

public class Score {						

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your score");
		int score=scan.nextInt();
		Grade.grades(score);			//CALLING OF STATIC METHOD
		scan.close();
	}

}

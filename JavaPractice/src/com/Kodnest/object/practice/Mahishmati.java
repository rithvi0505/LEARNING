package com.Kodnest.object.practice;
import java.util.Scanner;

public class Mahishmati {

	public static void main (String[] args) 
	{
		System.out.println("Enter number of soldiers");
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int w=0;
		System.out.println("Enter number of weapons");
		for(int i=1;i<=N;i++)
		{
		    int A=scan.nextInt();
		    int j=0;
		    if((A%2)==0)
		    {
		        j++;
		        System.out.println(j);
		    }
		    else{
		        
		    }
		    w=j;
		    System.out.println(w);
		}
		if(w>N)
		    {
		        System.out.println("READY FOR BATTLE");
		    }
		else
		    {
		        System.out.println("NOT READY");
		    }
	}
}

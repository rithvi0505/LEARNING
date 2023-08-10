package com.Kodnest.methods.methodoverloading;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter number of test cases, T: ");
	    int t=scan.nextInt();
	    tCheck(t);
	    
	}
	
	public static void tCheck(int t)
	{
	    
	    if(t>=1 && t<=100)
	    {
	        Scanner scan=new Scanner(System.in);
	        for(int i=0;i<t;i++){
	        
	        System.out.println("Enter outputs of Chef and Chefina, X Y:");
	        int x=scan.nextInt();
	        int y=scan.nextInt();
	        dice(x,y);
	        
	        }
	    }
	    else{
	        System.out.println("Enter valid value of T");
	    }
	    
	    
    }
    
    public static void dice(int x, int y)
    {
        
        if(x>=1 && y<=6){
            
        
            if((x+y)>=6)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
            
        else{
            System.out.println("X should be greater than 1 and Y should be smaller than 6");
        }    
    }
}

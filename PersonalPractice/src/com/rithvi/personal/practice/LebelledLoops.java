package com.rithvi.personal.practice;

public class LebelledLoops {

	public static void main(String[] args) {
		
		int i=1;
		ironman:while(i<=10)							//while labeled as iornman.
		{
			int j=1;
			while(j<=10)
			{
				System.out.print(i+"("+j+" time)   ");
				j++;
				
				System.out.println("broke, since break was there in the "+i+"th time");
				break ironman;																//while labeled as hulk.
				
			}
			
			System.out.println();
			i++;
		}

	}

}

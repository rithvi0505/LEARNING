package april.collection.comparable;

import java.util.Random;
import java.util.Scanner;

public class CricketGame {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("random number generation within 0 and 6");
		
		boolean out=false;
		
		int runs=0;
		
		while(!out)
		{
			System.out.println("Load a run between 0 to 6");
			
			int play=scan.nextInt();
			
			int bowl=bowling();
			
			if(play==bowl)
			{
				out=true;
				System.out.println("Wicket!!!!");
				break;
			}
			else
			{
				System.out.println("Your play: "+play);
				System.out.println("Bowler's play: "+bowl);
				runs=runs+play;
				System.out.println("runs: "+runs);
			}
			
		}
		
		System.out.println("total runs scored: "+runs);
		
		int target=runs+1;
		System.out.println("Target: "+(runs+1));
		
		out=false;
		runs=0;
		
		while(!out)
		{
			System.out.println("Load a bowl between 0 to 6");
			
			int play=scan.nextInt();
			
			int bowl=bowling();
			
			if(play==bowl)
			{
				out=true;
				System.out.println("Wicket!!!!");
				System.out.println("You win");
				break;
			}
			else
			{
				System.out.println("Your play: "+play);
				System.out.println("Bowler's play: "+bowl);
				runs=runs+bowl;
				System.out.println("runs: "+runs);
				
				if(runs>=target)
				{
					System.out.println("You lost the match");
					break;
				}
			}
			
		}
		
		
		
		
	}
	
	public static int bowling()
	{
		int min=0;
		int max=6;
		
		Random r=new Random();

		return r.nextInt(max-min+1)+min;
		
	}
	


	
}

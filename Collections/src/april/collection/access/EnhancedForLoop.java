package april.collection.access;

import java.util.ArrayDeque;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		//for any non-list based class, which do not have indexes, we can use enhanced for loop or for each loop
		
		ArrayDeque<Integer> ad=new ArrayDeque();
		ad.add(10);
		ad.add(12);
		ad.add(13);
		ad.add(14);
		ad.add(16);
		ad.add(18);
		
		System.out.println(ad);
		
		for(int x:ad)
		{
			System.out.println("Elements: "+x);
			
		}
		
		for(int i=0;i<=ad.size()-1;i++)			//size() method
		{
	//		System.out.println("Element: "+ad.get(i));		//get() method can not be used for non-list based classes 
		}
		

	}

}

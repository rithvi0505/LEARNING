package april.collection.access;

import java.util.ArrayList;

public class ForLoop {

	public static void main(String[] args) {
		
		//we can use get() method which exists in Lists, it can only be used with the collections which have indexes
		
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(15);
		al.add(16);
		al.add(18);
		al.add(20);
		
		for(int i=0;i<=al.size()-1;i++)			//size() method
		{
			System.out.println("Element: "+al.get(i));
		}
		

	}

}

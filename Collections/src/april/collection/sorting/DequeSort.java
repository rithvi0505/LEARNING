package april.collection.sorting;
import java.util.*;

public class DequeSort {

	public static void main(String[] args) {
	
		ArrayDeque<Integer> ad=new ArrayDeque();
		ad.add(10);
		ad.add(40);
		ad.add(50);
		ad.add(20);
		ad.add(15);
		
		System.out.println("unsorted:"+ ad);
		ArrayList<Integer> al=new ArrayList();
		
		al.addAll(ad);  //copying all the object into the Arraylist
		Collections.sort(al);  //now that the objects are in a List, it can be sorted with sort()
		
		System.out.println("sorted Array list: "+al);
		
		ad.clear();
		
		System.out.println("empty Arraydeque: "+ad);
		
		ad.addAll(al);

		System.out.println("Sorted ArrayDeque: "+ad);

	}

}

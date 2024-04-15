package april.collection.sorting;
import java.util.*;
public class ListSort {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList();
		al.add(20);
		al.add(10);
		al.add(80);
		al.add(87);
		al.add(30);
		
		Collections.sort(al);
		
		System.out.println(al);
		

	}

}

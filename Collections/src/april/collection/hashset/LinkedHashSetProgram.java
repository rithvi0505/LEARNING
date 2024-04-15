package april.collection.hashset;

import java.util.LinkedHashSet;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
	
		LinkedHashSet lhs=new LinkedHashSet();		//order of insertion is preserved.Suitable for efficient searching
		
		lhs.add(100);
		lhs.add("string");
		lhs.add(15.1);
		lhs.add(34);
		lhs.add(true);
		
		System.out.println(lhs);

	}

}

package april.collection.hashset;

import java.util.HashSet;

public class HashSetProgram {

	public static void main(String[] args) {			//order of insertion is not preserved. Not suitable for an efficient searching 
		
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(34);
		hs.add(true);
		hs.add(23);
		hs.add("string");
		
		System.out.println(hs);
		
	}

}

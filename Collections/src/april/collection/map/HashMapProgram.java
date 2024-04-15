package april.collection.map;

import java.util.HashMap;

public class HashMapProgram {

	public static void main(String[] args) {
		
		//HashMap won't maintain the order of insertion or order it, it is random
		
		HashMap hm1=new HashMap();
		hm1.put(10,"Hello");
		hm1.put(8,"Mr");
		hm1.put("jaghs","How ");		//unlike TreeMap, in HashMap, homogeneous keys are possible 
		hm1.put(2,"Are");
		hm1.put(18,"You");
		
		
		System.out.println(hm1);
		
	}

}

package april.collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMapProgram {

	public static void main(String[] args) {
		
		//maintains order of insertion
		//homogeneous keys are possible
		
		LinkedHashMap lhm=new LinkedHashMap();
		
		lhm.put(10,"hello");
		lhm.put("version: ","silence");
		lhm.put(true,"world");
		lhm.put('h',166);
		lhm.put(10.5,"hello");
		
		System.out.println(lhm);

	}

}

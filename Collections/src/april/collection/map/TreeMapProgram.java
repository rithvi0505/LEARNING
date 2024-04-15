package april.collection.map;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapProgram {

	public static void main(String[] args) {
		
		//Key-value pairs
		
		TreeMap tm=new TreeMap();
		tm.put(1,"Dog");			//we use put() method for adding the key-value pairs
		tm.put(3,"Cat");
		tm.put(7,"Monkey");
		tm.put(42,"Donkey");
		tm.put(31,"Elephant");
		
		System.out.println(tm);
		
		TreeMap tm2=new TreeMap();
		tm2.put(1,45);
		tm2.put(7,"String");
		tm2.put(3,'c');
		tm2.put(5,true);
		
		System.out.println(tm2);
		
		TreeMap<Integer, String> tm3=new TreeMap();
		tm3.put(7,"What's");
		tm3.put(3,"Hello");
		tm3.put(9,"up?");
		tm3.put(4,"Girl");
		
		
		System.out.println(tm3);
		
		
		
		
	}

}

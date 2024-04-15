package april.collection.map;

import java.util.Set;
import java.util.TreeMap;
import java.util.*;

public class AccessingMap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm1=new TreeMap();
		
		tm1.put(10,"String1");
		tm1.put(15,"String4");
		tm1.put(11,"String2");
		tm1.put(18,"String5");
		tm1.put(13,"String3");
		System.out.println(tm1);
		
		Set keys=tm1.keySet();		//keys is  of Set class type
		
		for(Object x:keys)
		{
			System.out.println("keys: "+x);
		}
		
		Collection value=tm1.values();		//values is of Collection class type
		
		for(Object x:value)
		{
			System.out.println("value: "+x);
		}
		
		Set kv=tm1.entrySet();		//entrySet is of Set Object type
		
		for(Object x:kv)
		{
			System.out.println("pair: "+x);
		}
		
	}

}

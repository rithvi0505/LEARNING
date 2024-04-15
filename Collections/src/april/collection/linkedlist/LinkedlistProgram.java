package april.collection.linkedlist;
import java.util.*;
public class LinkedlistProgram {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add(true);
		l.add(700);
		l.add(5.98);
		l.add('h');
		l.add("String");
		
		System.out.println(l);
		
		l.add(2,"Replacing");
		
		System.out.println(l);

	}

}

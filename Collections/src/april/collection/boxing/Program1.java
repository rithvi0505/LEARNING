package april.collection.boxing;
import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(new Integer(50));
		al.add(new Boolean(true));
		al.add(10);
		
		System.out.println(al);

	}

}

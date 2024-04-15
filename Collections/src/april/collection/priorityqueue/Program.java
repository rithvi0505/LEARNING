package april.collection.priorityqueue;
import java.util.*;
public class Program {

	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue();//remember, PriorityQueue does not give sorted list, it just brings up the least element at first place
		pq.add(78);										//hence, PriorityQueue is partially sorted
		pq.add(4);
		pq.add(79);
		pq.add(9);
		
		System.out.println(pq);
		

	}

}

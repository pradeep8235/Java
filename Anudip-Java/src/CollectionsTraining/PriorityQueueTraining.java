package CollectionsTraining;
import java.util.*;
public class PriorityQueueTraining {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("India");
		pq.add("Russia");
		pq.add("France");
		System.out.println(pq);
		System.out.println("Top Order: " + pq.peek());
		System.out.println(pq.remove());
		System.out.println(pq);
		
		//-------------------------//
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("India");
		ll.add("Russia");
		ll.add("France");
		System.out.println(ll);
		System.out.println("Top Order: " + ll.peek());
		System.out.println(ll.remove());
		System.out.println(ll);
	
	}
}

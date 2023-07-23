package CollectionsTraining;
import java.util.LinkedList;
public class LinkedListTraining {
	// FIFO ( First in First Out )
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Deep");
		ll.add("Tech");
		ll.add("Java");
		ll.add("Trainings");
		System.out.println(ll);
		ll.addFirst("Bangalore");
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.add(2, "Developer");
		System.out.println(ll);
		ll.pop();
		System.out.println(ll); // Default: first element 
		// will be delete 
		ll.push("Welcome");
		System.out.println(ll);
		ll.poll();
		System.out.println(ll);
		ll.poll();
		System.out.println(ll);
		ll.clear();
		System.out.println(ll);
	}

}

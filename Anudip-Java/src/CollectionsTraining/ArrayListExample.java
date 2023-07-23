package CollectionsTraining;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Meghana");
		al.add("Ramya");
		al.add("Supriya");
		al.add(10);
		al.add(12.55);
		System.out.println(al);
		// Using Interator 
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		al.remove(2);
		System.out.println(al);
		}
}
// add() , remove() methods used to insert and delete a element
// in a list

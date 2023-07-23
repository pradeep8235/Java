package CollectionsTraining;
import java.util.*;
public class HashTableExample {

	public static void main(String[] args) {
		
		Hashtable<String,Integer> ht = new Hashtable<>();
		// Syntax
		// Hashtable<Key,value> 
		ht.put("Rahul", 100);
		ht.put("Lokesh", 150);
		ht.put("Makesh", 200);
		// ht.put(null, 500); // Null Pointer Exception
		// ht.put("Ramya", null); // Null Pointer Excception
		System.out.println(ht);
		ht.put("Balaji", 20);
		ht.put("Azar", 1000);
		System.out.println(ht);
	}

}

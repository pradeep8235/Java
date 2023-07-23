package CollectionsTraining;

import java.util.HashMap;

public class HashMaptraining {

	public static void main(String[] args) {
		
		HashMap<String,Integer> ht = new HashMap<>();
		// Syntax
		// Hashtable<Key,value> 
		ht.put("Rahul", 100);
		ht.put("Lokesh", 150);
		ht.put("Makesh", 200);
		ht.put(null, 500);
		ht.put("Pradeep", null);
		// ht.put(null, 500); // Null Pointer Exception
		// ht.put("Ramya", null); // Null Pointer Excception
		System.out.println(ht);
	

	}

}

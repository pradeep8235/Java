package CollectionsTraining;

import java.util.*;
public class HashTableTraining4 {

	public static void main(String[] args) {
		Hashtable<String,Integer> h = new Hashtable<>();
		h.put("Chennai", 100);
		h.put("Delhi", 700);
		h.put("Bangalore", 500);
		System.out.println(h);
		h.put("Kolkata", 5);
		System.out.println(h);
		h.put("Mumbai", 100000);
		// Key , value
		System.out.println(h);
		h.put("Punjab", 2);
		System.out.println(h);
		h.put("Gujarat", 501);
		System.out.println(h);
		h.remove("Kolkata");
		System.out.println(h);
		
	}

}

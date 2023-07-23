package CollectionsTraining;

import java.util.*;
public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<String,Integer> h = new Hashtable<>();
		// Key,value
		h.put("Admin", 100);
		h.put("Admin", 101);
		h.put("Admin", 102);
		h.put("Admin", 103);
		h.put("Exe", 104);
		h.put("Exe", 105);
		h.put("Exe", 106);
		h.put("Sales", 107);
		h.put("Sales", 108);
		h.put("Sales", 109);
		h.put("Hr", 110);
		h.put("Hr", 111);
		System.out.println(h);
		System.out.println(h.contains(103));
	}
}
// // Hint : To Search department Id wise use : HashTable
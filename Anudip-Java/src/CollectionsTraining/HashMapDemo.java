package CollectionsTraining;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		

		HashMap<String,Integer> h = new HashMap<>();
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
		System.out.println(h.containsKey("Manager"));

	}
}
// Hint : To Search department name wise use : HashMap

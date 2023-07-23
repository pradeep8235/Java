package CollectionsTraining;
import java.util.*;
import java.util.HashSet;
public class HashSetTraning {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Apple");
		hs.add("Orange");
		hs.add("Grapes");
		System.out.println(hs);
		hs.add("Apple");
		System.out.println(hs);

	}

}

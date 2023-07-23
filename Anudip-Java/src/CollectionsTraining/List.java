package CollectionsTraining;

import java.util.*;
public class List {

	public static void main(String[] args) {
		LinkedList<String> ar =new LinkedList<String>();
		ar.add("A");
		ar.add("B");
		ar.add("C");
		ar.add("D");
		ar.add("E");
		System.out.println(ar);
		ar.remove(1);
		System.out.println(ar);
	    ar.addFirst("X");
	    System.out.println(ar);
	    ar.removeLast();
	    System.out.println(ar);
	}

}

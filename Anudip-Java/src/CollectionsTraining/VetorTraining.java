package CollectionsTraining;
import java.util.*;
public class VetorTraining {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		v.add("Java");
		v.add("Python");
		v.add("Csharp");
		v.add("Java");
		System.out.println(v);
		// Using Iterator Interface to display elements
		Iterator i = v.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		// Using For  Each to display elements
		for(String vt : v)
		{
			System.out.println(vt);
		}

	}

}

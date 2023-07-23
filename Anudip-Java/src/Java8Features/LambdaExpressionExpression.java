package Java8Features;
import java.util.*;
public class LambdaExpressionExpression {
	

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al); // List Format
		al.forEach((n)->System.out.println(n)); 
		// lambda Expression ( -> ) Arrow
		
		ArrayList<String> as = new ArrayList<String>();
		as.add("Audi");
		as.add("RR");
		as.add("Ferrai");
		System.out.println(as);
		as.forEach((car)->System.out.println(car));
		System.out.println(as.size());
		Iterator<String> it = as.iterator();
		while(it.hasNext()) // After Audi .. Is it Any Values in the list
		{
		System.out.println(it.next());
		}
	}

}

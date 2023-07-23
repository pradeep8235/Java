package CollectionsTraining;

import java.util.*;
public class StackTraining {
// Lastin FirstOUt ( LIFO )
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		st.add(50);
		System.out.println(st);
		for(int a:st) 
		{
			System.out.println(a);
		}
		st.add(100);
		System.out.println(st);
		st.pop();
		System.out.println(st);
		st.push(500);
		System.out.println(st);
		System.out.println(st.peek()); // Cursor Position return item (500)
		st.push(1000);
		System.out.println(st.peek()); // Cursor Position return item (1000)
		 // Address of Stack Object
		System.out.println(st.hashCode());
		st.remove(1);
		System.out.println(st);
		// Note : Using Item values can't be delete
		// Only with help of index values to delete or remove data from the lists
	}

}

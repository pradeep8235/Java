package StringHandlingMethods;

public class String10 {

	public static void main(String[] args) {
		StringBuilder s1= new StringBuilder("Welcome to Java");
		System.out.println(s1.reverse());
		
		String s2=" DeepTech";
		System.out.println(s1.append(s2));
		StringBuilder s3= new StringBuilder("Hi Bangalore");
		System.out.println(s3.insert(10, "Kiran"));
		// Insert(indexposition,value)
		System.out.println(s3.delete(1, 3));
		// Delete (Starting indexposition,Starting endvalue)
		String s4="Bangalore to Mysore";
		System.out.println(s4);
		System.out.println(s4.replace("Mysore", "Mumbai"));
	}

}

package WrapperClassTraining;

public class AutoBoxing {

	public static void main(String[] args) {
		
		int i=10;	// datatype
		Integer j = Integer.valueOf(i); // Convert int to Integer using Method
		Integer k = i; // AutoBoxing : Java Compiler Automatic Conversion
		System.out.println(i+ "   " + j + "   " + k);

	}

}

package WrapperClassTraining;

public class UnBoxing {

	public static void main(String[] args) {
		Integer i = new Integer(3);
		int x = i.intValue(); // Method
		int y = i ; // UnBoxing : Java Compiler will perform unboxing 
		System.out.println(i+ "   " +  x +"   "+ y );

	}

}

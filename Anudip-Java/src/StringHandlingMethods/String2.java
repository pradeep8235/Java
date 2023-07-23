package StringHandlingMethods;

public class String2 {

	public static void main(String[] args) {
		// == Operator
		String s1 = "Welcome"; // String pool 
		String s2 = "Welcome"; // S2 Refers same Address
								// of S1 
		if(s1==s2)	// To Refer Address Location
		{
			System.out.println("Strings are equals");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		System.out.println("Address s1 " + s1.hashCode());
		System.out.println("Address s2 " + s2.hashCode());

	}

}

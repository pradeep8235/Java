package StringHandlingMethods;

public class String6 {

	public static void main(String[] args) {
		
		String x="pavan"; // String literals
		String y="PAVAN"; // String literals
		if(x.equals(y)) // case sensitive
		{
			System.out.println("String are equals");
		}
		else
		{
			System.out.println("String are not equals");
		}
		// Gagan 
		if(x.equalsIgnoreCase(y)) // Ignore Case sensitive
		{
		System.out.println("String are equals");	
		}
		else
		{
			System.out.println("Strings are not equals"); 
		}

	}

}

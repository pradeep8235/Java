package StringHandlingMethods;

public class String3 {

	public static void main(String[] args) {
		
		String str1="DeepTech"; 
		StringBuilder str2 = new StringBuilder("DeepTech");
		if(str1.equals(str2)) // Values
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equals");
		}
System.out.println("Address of Str1 " + str1.hashCode());
// Str1 ( String pool Memory )
System.out.println("Address of Str2 " + str2.hashCode());
// Str2 ( Heap Memory )
	}

}

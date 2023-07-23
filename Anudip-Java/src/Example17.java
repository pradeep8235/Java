
public class Example17 {

	public static void main(String[] args) {
		String str1="DeepTech";
		String str2="DeepTech";
		// Equals() Method: It is  used to compare with values 
		if(str1.equals(str2))
		{
			System.out.println("Strings are Matched with values");
		}
		else
		{
			System.out.println("Strings are not matched");
		}
		// == Operator : It is used to Compare with address
		if(str1==str2) // Integer values
		{
			System.out.println("Strings are Matched with Address");
		}
		else
		{
			System.out.println("Strings are not matched");
		}

	}

}

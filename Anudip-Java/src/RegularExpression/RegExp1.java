package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1 {

	public static void main(String[] args) {
		
		Pattern pat=Pattern.compile("ADMIN",Pattern.CASE_INSENSITIVE);
		Matcher mat=pat.matcher("admin");
		boolean result=mat.find();
		if(result) // True
		{
			System.out.println("Matched");
		}
		else // False
		{
			System.out.println("Not Matched");
		}

	}

}

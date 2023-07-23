package Java8Features;

import java.util.Optional;

public class OptionalExample2 {

	public static void main(String[] args) {
		String[] a = new String[10];
		a[0]="Bangalore";
		a[1]="Chennai";
		a[2]="Mumbai";
		//System.out.println(a[3].toUpperCase());
		Optional<String> check = Optional.ofNullable(a[5]);
		if(check.isPresent())	// True or False
		{
			System.out.println(a[2].toUpperCase());
		}
		else
		{
			System.out.println("String is not present");
		}

	}

}

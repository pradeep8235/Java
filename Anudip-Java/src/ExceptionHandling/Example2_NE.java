package ExceptionHandling;
import java.util.Optional;
import java.util.Scanner;
public class Example2_NE {

	public static void main(String[] args) {
		
		String[] bike = new String[5];
		int n;
		System.out.println("How Many records You want to Enter");
		Scanner din = new Scanner(System.in);
		n = din.nextInt();
		for(int i=0;i<n;i++)
		{
			bike[i]=din.next();
		}
		System.out.println("********************");
		Optional<String> check = Optional.ofNullable(bike[4]);
		if(check.isPresent())
		{
			System.out.println(bike[4].toUpperCase());
		}
		else
		{
			System.out.println("String is not present");
		}
	}

}
/*
 *  bike[0]="ktm";
 *  bike[1]="ferrai;
 *  bike[2]="bmw";
 *  bike[3]=null; // Operation Handling
 *  bike[4]=null;
 */
 

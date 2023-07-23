import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		String choice;
		Scanner din = new Scanner(System.in);
		System.out.println("Choose Your Role");
		choice = din.next();
		switch(choice)
		{
		case "+": System.out.println("Addition Result");
			break;
		
		case "-": System.out.println("Subtraction Result");
			break;
		default: System.out.println("Sorry Invalid Selection");
		}

	}

}

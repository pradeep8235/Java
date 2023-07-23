package Enumeration;
import java.util.*;

enum ATM	// User-defined class
{
	BALANCECHECK,
	ENQUIRY,
	WITHDRAWL,
	TRANSFER
}

public class EnumerationBank {

	public static void main(String[] args) {
		String option;
		Scanner din = new Scanner(System.in);
		System.out.println("Enter Your Option: ENUM");
		option = din.next();
		int getvalue = ATM.valueOf(option.toUpperCase()).ordinal();
		System.out.println(getvalue); // 
		switch(getvalue)
		{
		case 0:System.out.println("Balance Check Process");
			break;
		case 1:System.out.println("EnQuiry Process");
			break;
		case 2:System.out.println("Withdrawl Process");
			break;
		case 3:System.out.println("Transfer Process");
			break;
		default: System.out.println("Invalid Selection");
		} 

	}

}

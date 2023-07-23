import java.util.Scanner;

public class Example23 {
	String bankName,accountNumber,accountType;
	String accountHolderName,accountPin;
	double accountBalance;
	// Class Instance Member Variables
	
	Example23(String bN,String aN,String aT,String aHN,String aP,double aB) // Constructor
	{
		bankName = bN;
		accountNumber = aN;
		accountType = aT;
		accountHolderName = aHN;
		accountPin = aP;
		accountBalance = aB;
	}
	Scanner din = new Scanner(System.in);
	void process(Example23 person2)
	{
		String accno,accpin;
		String choice ="y";
		int option;
		String taccno;
		double damount,wamount,tamount;
		while(choice.equals("y") || choice.equals("Y") )
		{
			System.out.println("Welcome To ***HAPPY*** ATM");
			System.out.println("1. WithDrawl");
			System.out.println("2. Deposit");
			System.out.println("3. Transfer");
			System.out.println("4. Balance Check");
			System.out.println("please Select Your option");
			option = din.nextInt(); // 1 or 2 or 3 or 4
			switch(option)
			{
			case 1: System.out.println("Withdrawl Process");
			System.out.println("Enter Account Number");
			accno = din.next();
			if(accno.equals(accountNumber))
			{
				System.out.println("Enter Secret Pin Digit");
				accpin = din.next();
				if(accpin.equals(accountPin))
				{
					System.out.println("Please Enter Your Withdrawl Amount");
					wamount = din.nextDouble();
					if(wamount > accountBalance)
					{
						System.out.println("Sorry !! InSufficient Amount");
					}
					else
					{
						accountBalance = accountBalance -wamount;
						System.out.println("Please wait .. Your Transaction is processing");
						System.out.println("Please Take Your Cash !!!");
					}
				}
				else
				{
					System.out.println("Invalid Login Credentials");
				}
			}
			else
			{
				System.out.println("Account Number Not Valid");
			}
				break;
			case 2: System.out.println("Deposit Process");
			System.out.println("Enter Account Number");
			accno = din.next();
			if(accno.equals(accountNumber))
			{
				System.out.println("Enter Secret Pin Digit");
				accpin = din.next();
				if(accpin.equals(accountPin))
				{
					 System.out.println("Enter Deposit Amount");
					 damount = din.nextDouble();
					 accountBalance= accountBalance + damount;
					 System.out.println("Your Amount Desposited Success");
				}
				else
				{
					System.out.println("Invalid Login Credentials");
				}
			}
			else
			{
				System.out.println("Account Number Not Valid");
			}
				break;
			case 3: System.out.println("Transfer Process");
			System.out.println("Enter Account Number");
			accno = din.next();
			if(accno.equals(accountNumber))
			{
				System.out.println("Enter Secret Pin Digit");
				accpin = din.next();
				if(accpin.equals(accountPin))
				{
					System.out.println("Enter Transfer Account Number");
					taccno = din.next();
					if(taccno.equals(person2.accountNumber))
					{
						System.out.println("Account Verified");
						System.out.println("Enter Transfer Amount");
						tamount = din.nextDouble();
						if(tamount>accountBalance)
						{
							System.out.println("Sorry !! InSufficient Fund");
						}
						else
						{
							accountBalance = accountBalance - tamount;
							person2.accountBalance= person2.accountBalance+tamount;
							System.out.println("Amount Transferred Success");
						}
					}
					else
					{
						System.out.println("Account is Not Verified");
					}
				}
				else
				{
					System.out.println("Invalid Login Credentials");
				}
			}
			else
			{
				System.out.println("Account Number Not Valid");
			}
				break;
			case 4: System.out.println("Balance Check Process");
					System.out.println("Enter Account Number");
					accno = din.next();
					if(accno.equals(accountNumber))
					{
						System.out.println("Enter Secret Pin Digit");
						accpin = din.next();
						if(accpin.equals(accountPin))
						{
							System.out.println("Your Current Balance Amount " + accountBalance);
						}
						else
						{
							System.out.println("Invalid Login Credentials");
						}
					}
					else
					{
						System.out.println("Account Number Not Valid");
					}
				break;
			default: System.out.println("Sorry !! Invalid Selection");
			}
			System.out.println("Do You Want To Continue Press Y Or Exit Press N:");
			choice = din.next();
		}
	}
	void display()
	{
		System.out.println("Bank Name " + bankName);
		System.out.println("Account Number " + accountNumber);
		System.out.println("Account Type " + accountType);
		System.out.println("Account Holder Name " + accountHolderName);
		System.out.println("Account Pin   "  + accountPin);
		System.out.println("Account Balance " + accountBalance);
	}
	public static void main(String[] args) {
		
		Example23 person1=new Example23("SBI","SBI12345","Savings","Ramya","1234",15000);
		Example23 person2=new Example23("HDFC","HDFC12345","Savings","Supriya","0011",8500);
		person1.process(person2);
		//person1.display();
		//person2.display();
	}

}

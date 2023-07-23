import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username,password;
		Scanner din = new Scanner(System.in);//
		System.out.println("Enter UserName");
		username = din.next();	// To get input from user
		System.out.println("Enter Password");
		password = din.next();
		if(username.equals("Admin") && password.equals("welcome"))
		{
			System.out.println("Login Success");		
		}
		else
		{
			System.out.println("Invalid Logins");
		}
	}

}

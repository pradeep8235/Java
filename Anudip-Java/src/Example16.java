import java.util.Scanner;

public class Example16 {

	public static void main(String[] args) {
	
		String username,password;
		int check=3;
		Scanner din = new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter Your UserName or UserId");
			username = din.next();
			System.out.println("Enter Your Password");
			password = din.next();
			if(username.equals("DeepTech") && password.equals("Myteam"))
			{
				System.out.println("Login Success");
				break;
			}
			else
			{
				check = check -1;
				System.out.println("Error-108 Incorrect UserID or Password.You Have Left "+check+" Attempt");
			}
		}
		if(check == 0)
		{
			System.out.println("Your Account Has been Blocked");
			System.out.println("The Service will be UNLOCKED after 6 Hrs - Indian Bank");
		}

	}

}

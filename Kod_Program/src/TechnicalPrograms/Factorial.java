package TechnicalPrograms;
import java.util.Scanner;
class Fact{
	static int number(int n) {
		if(n==0) {
			return 0;
		}
		else {
			int digit=1;
			while(n!=0) {
				digit=digit*n;
				n=n-1;
				}
			return digit;
		}
	}
}
public class Factorial {
	public static void main(String[] args) {
	 System.out.println("Enter the number to which factorial has to be found");
	 Scanner scan = new Scanner(System.in);
	 int num= scan.nextInt();
	int res= Fact.number(num);
	System.out.println(res);
	}
}

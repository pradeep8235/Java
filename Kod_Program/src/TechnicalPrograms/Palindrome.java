package TechnicalPrograms;
import java.util.*;
class pali{
	static int palindrome(int n){
		int digit=0,ans=0;
		while(n!=0) {
			digit=n%10;
			ans=ans*10+digit;
			n=n/10;
		}
	return ans;
	}
}
public class Palindrome {
	public static void main(String[] args) {
		System.out.println("enter the number to check palindrome or not");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int res=pali.palindrome(num);
		if(res == num) {
			System.out.println("the entered num  "+num+" is palindrome");
		}
		else {
			System.out.println("the entered number "+num+" is not palindrome");
		}
		
	}

}

package TechnicalPrograms;
import java.util.*;
class reverse{
	static int rev(int n) {
		int digit=0,ans=0;
		while(n!=0) {
			digit=n%10;
			ans=ans*10+digit;
			n=n/10;
		}
		return ans;
	}
}
public class ReverseDigit {

	public static void main(String[] args) {
		System.out.println("enter the number to be reversed");
		Scanner scan =new Scanner (System.in);
		int num =scan.nextInt();
		int res=reverse.rev(num);
		System.out.println(res);
	}

}

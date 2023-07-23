package TechnicalPrograms;
import java.util.*;
class  digitsum{
	static int totalsum(int n) {
		int sum=0,digit=0,i=0;
		while(n!=0) {
			digit=n%10;
			sum =sum+digit;
			n=n/10;
			i++;
		}
		return sum;
	}
}
public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println("enter the digit to find the total sum ");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		int sum=digitsum.totalsum(num);
		System.out.println("total entered digit sum is "+sum);
		}
}

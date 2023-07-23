package TechnicalPrograms;
import java.util.Scanner;
class Strong{
	static int fac(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	static int StrongNum(int num) {
		int sum=0;
		while(num!=0) {
			int digit=num%10;
		    sum =sum+fac(digit);
		    num=num/10;
		}
		return sum;
	}
}
public class StrongNumber {
	public static void main(String[] args) {
	System.out.println("Enter the number to find strong number or not");
	Scanner scan = new Scanner(System.in);
	int num=scan.nextInt();
	int res=Strong.StrongNum(num);
		if(res==num) {
			System.out.println("the entered number is Strong Number");
		}
		else {
			System.out.println("the entered number is not strong number");
		}
	}

}

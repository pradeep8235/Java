package TechnicalPrograms;
import java.util.Scanner;

class StRange{
	static int StrongNum(int n) {
		int fact =1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	static int StrongRange(int num) {
		int sum=0;
		while(num!=0) {
			int digit =num%10;
		    sum=sum+StrongNum(digit);
		    num=num/10;
		}
		return sum;
	}
}
public class StrongNumberRange {
	public static void main(String[] args) {
	  System.out.println("Enter the range  to strong numbers ");
	  Scanner scan = new Scanner(System.in);
	  int a= scan.nextInt();
	  int b= scan.nextInt();
	  for (int i=a;i<=b;i++) {
		int res=  StRange.StrongRange(i);
		if(res==i) {
			System.out.println(i+"is a strong number");
		}
	  }
	}

}

package TechnicalPrograms;
import java.util.Scanner;
class HarshadRange{
	static boolean HarshNumRange(int n) {
		int temp=n;
		int sum=0;
		int digit=0;
		while(temp!=0) {
			digit=temp%10;
			sum =sum+digit;
			temp=temp/10;
		}
		if(n%sum==0) {
			return true;
		}
		return false;
	}
}
public class HarshadNumberRange {
	public static void main(String[] args) {
		System.out.println("Enter the range to find Harshad Number");
		Scanner scan = new Scanner(System.in);
		int count=0;
		int a= scan.nextInt();
		int b= scan.nextInt();
		for(int i=a;i<=b;i++) {
			boolean res=HarshadRange.HarshNumRange(i);
			if(res==true) {
				System.out.println(i+" is Harshad number");
				count++;
			}
		}
		System.out.println(count);
	}

}

package TechnicalPrograms;
import java.util.Scanner;
class Har{
	static boolean HarNum(int num) {
		int sum=0;
		int temp=num;
		while(temp!=0) {
			int digit=temp%10;
			sum=sum+digit;
			temp=temp/10;
		}
		if(num%sum==0) {
			return true;
		}
		return false;
	}
}
public class HarshadNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number to finf Harshad Number Or Not");
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		boolean res=Har.HarNum(num);
		if(res==true) {
			System.out.println("the entered number is Harshad Number");
		}
		else {
			System.out.println("The entered number is not Harshad Number");
		}
	}

}

package TechnicalPrograms;
import java.util.Scanner;
class Perfect{
	static int PerfectNum(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
}

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println("enter the number to find perfect number or not");
		Scanner scan = new Scanner(System.in);
		int num= scan.nextInt();
		//in side main
//		int sum=0;
//		for(int i=1;i<num;i++) {
//			if(num%i==0) {
//				sum=sum+i;
//				}
//			}
//		System.out.println(sum);
		
		//using method
		int res=Perfect.PerfectNum(num);
		if(res==num) {
			System.out.println("The entered num is perfect number");
		}
		else {
			System.out.println("the entered num is not perfect number");
		}
	}	
		
}


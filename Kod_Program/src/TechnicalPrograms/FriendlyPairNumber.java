package TechnicalPrograms;
import java.util.Scanner;
class Friend{
	static int FrndPair(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
}
public class FriendlyPairNumber {
	public static void main(String[] args) {
		System.out.println("Enter the 2 number to find Friendly Number ");
		Scanner scan = new Scanner(System.in);
		int num1=scan.nextInt();
		int num2 =scan.nextInt();
		int res1=Friend.FrndPair(num1);
		int res2=Friend.FrndPair(num2);
		if(num1/res1==num2/res2) {
			System.out.println("the entered 2 numbers are Friendly Pair");
		}
		else{
			System.out.println("the entered 2 numbers are not Friendly Pair");
		}
		
	}

}

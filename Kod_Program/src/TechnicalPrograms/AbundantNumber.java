package TechnicalPrograms;
import java.util.Scanner;
class Abuan{
	static int AbundantNum(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return sum; 
	}
}
public class AbundantNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number to find Abundant Number or Not");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		int res =Abuan.AbundantNum(num);
		if(res>num) {
			System.out.println("the entered number is Abundant Number");
		}
		else {
			System.out.println("the entered number is not Abundant Number");
		}
				
	}

}

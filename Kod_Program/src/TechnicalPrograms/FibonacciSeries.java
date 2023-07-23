package TechnicalPrograms;
import java.util.Scanner;
class Fib{
	static void Num(int n ) {
		int num1=0;
		int num2=1;
		if (n==1) {
			System.out.println(num1);
		}
		else if(n==2) {
			System.out.println(num1+num2);
		}
		else {
			System.out.print(num1+" "+num2+" ");
			for (int i=3;i<=n;i++) {
				int fib=num1+num2;
				System.out.print(fib+" ");
				num1=num2;
				num2=fib;
			}
		}
		
	}
}
public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("enter the first n numbers");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Fib.Num(num);
		
	}

}

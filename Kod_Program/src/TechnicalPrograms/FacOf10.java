package TechnicalPrograms;
import java.util.Scanner;
class Fac10{
	static void Factor(int n) {
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
}
public class FacOf10 {

	public static void main(String[] args) {
		System.out.println("Enter the number to which factors has to be found");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		Fac10.Factor(num);
		
	
	}

}

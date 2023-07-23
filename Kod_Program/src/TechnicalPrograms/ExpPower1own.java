package TechnicalPrograms;

import java.util.Scanner;
class ownmethod{
	static int pow(int a,int e) {
		int power=1;
		for(int i=1;i<=e;i++) {
			power=power*a;
		}
		return power;
	}
}
public class ExpPower1own {

	public static void main(String[] args) {
		System.out.println("enter the base and exp number");
		Scanner scan = new Scanner (System.in);
		int base = scan.nextInt();
		int exp=scan.nextInt();
		int res=ownmethod.pow(base, exp);
		System.out.println(res);
	}

}

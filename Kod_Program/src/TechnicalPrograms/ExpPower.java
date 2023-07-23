package TechnicalPrograms;
import java.util.*;

class exponent{
	static double power(int a,int b){
		double ans=Math.pow(a, b);
		return ans;
	}
}

public class ExpPower {
	public static void main(String[] args) {
		System.out.println("enter the base and exp number");
		Scanner scan = new Scanner (System.in);
		int base = scan.nextInt();
		int exp=scan.nextInt();
		double res=exponent.power(base, exp);
		int finaloutput=(int)res;
		System.out.println(finaloutput);
		
	}

}

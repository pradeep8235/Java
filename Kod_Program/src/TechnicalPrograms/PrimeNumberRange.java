package TechnicalPrograms;
import java.util.*;
class primerange{
boolean isprime(int n) {
		
		if(n==0||n==1) {
			return false;
		}
		else if(n==2){
		     return true;
	}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
}}

public class PrimeNumberRange {

	public static void main(String[] args) {
		System.out.println("enter the range of values to find prime numbers");
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		primerange p= new primerange();
		for(int i=a;i<=b;i++) {
			boolean res=p.isprime(i);
			if(res==true) {
				System.out.println("the prime numbers range from "+a+"  to  "+b+" are "+i );
			}
		}

	}

}

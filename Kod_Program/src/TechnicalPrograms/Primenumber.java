package TechnicalPrograms;
import java.util.*;

class prime{
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

public class Primenumber {
	
	public static void main(String[] args) {
		System.out.println("enter the number to find prime number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		prime p=new prime();
		boolean res=p.isprime(num);
		if (res==true) {
			System.out.println("the entered number "+num+" is prime number");
		}
		else {
			System.out.println("the entered number "+num+" is not prime number");
		}
	}

}


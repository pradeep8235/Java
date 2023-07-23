package TechnicalPrograms;
import java.util.*;
class Arm{
	static int Power(int n){
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		return count;
	}
	static int ArmStrong(int n,int p) {
		int sum=0,digit=0;
		while(n!=0) {
			digit=n%10;
			int value=(int) Math.pow(digit,p);
			sum=sum+value;
			n=n/10;
		}
		return sum;
		
	}
}


public class ArmStrongNumber {
	public static void main(String[] args) {
	  System.out.println("enter the number for finding ArmStrongNUMBER OR NOT");
	  Scanner scan= new Scanner(System.in);
	  int num= scan.nextInt();
	  int power=Arm.Power(num);
	  int res=Arm.ArmStrong(num,power);
	   if(res==num) {
		   System.out.println("the number is ArmStrong Number");
	   }
	   else {
		   System.out.println("The entered number is not Armstrong number");
	   }
	}

}

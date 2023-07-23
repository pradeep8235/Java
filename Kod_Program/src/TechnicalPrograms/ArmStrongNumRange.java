package TechnicalPrograms;
import java.util.Scanner;

class ArmRange{
	static int demo(int n) {
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		return count;
	}
	static int Number(int n,int p) {
		int sum=0;
		while(n!=0) {
			int digit=n%10;
			int value=(int)Math.pow(digit, p);
			sum=sum+value;
			n=n/10;
		}
		return sum;
	}
}

public class ArmStrongNumRange {
	public static void main(String[] args) {
        System.out.println("eneter the range to find ArmStrongNumber");
        Scanner scan = new Scanner(System.in);
        int count=0;
        int a=scan.nextInt();
        int b= scan.nextInt();
        for(int i=a;i<=b;i++) {
        	int power=ArmRange.demo(i);
        	int res=ArmRange.Number(i, power);
        	if(res==i) {
        		System.out.println(i+" is ArmStrong Number");
        		count++;
        	}
        }
        System.out.println("Total count of range is "+count);
	}

}

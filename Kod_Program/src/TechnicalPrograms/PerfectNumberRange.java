package TechnicalPrograms;
import java.util.Scanner;
class PerfectNum{
	static int PerfectRange(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
}
public class PerfectNumberRange {
	public static void main(String[] args) {
	  System.out.println("enter the range to find perfect number");
	  Scanner scan= new Scanner (System.in);
	  int a= scan.nextInt();
	  int b= scan.nextInt();
	  for(int i=a;i<b;i++) {
		  int res=PerfectNum.PerfectRange(i);
		  if(res==i) {
			  System.out.println(i+" is a perfect number");
		  }
	  }
	}

}

package TechnicalPrograms;
import java.util.*;
class Demosum{
	int sumrange(int a,int b) {
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum=sum+i;
		}
		return sum;
	}
}
public class Sum_1st_n_numbers_range {

	public static void main(String[] args) {
		System.out.println("Enter the 2 number between which u want to get the total sum");
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();   // first value from user comes here.
		int b= scan.nextInt();  //second value from user comes here.
		Demosum d= new Demosum(); 
		int res=d.sumrange(a, b);
		System.out.println("total sum in the given range "+res);
}

}

package TechnicalPrograms;
import java.util.*;
//sub class
class Demo{
	int sum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}
}
//main code
public class Sum_1st_n_numbers {
	public static void main(String[] args) {
		System.out.println("Enter the number to add first n numbers");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		Demo d= new Demo();
		int res=d.sum(num);
		System.out.println("Total value of first "+num+" numbers is  "+res);
	}
}

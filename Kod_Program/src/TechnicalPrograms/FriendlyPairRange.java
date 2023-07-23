package TechnicalPrograms;
import java.util.Scanner;
class FriendRange{
	static int FrndPair(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
}
public class FriendlyPairRange {
	public static void main(String[] args) {
		System.out.println("Enter the 2 range to find Friendly Number ");
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b =scan.nextInt();
		for(int i=a;i<=b;i++) {
			for(int j=i;j<=b;j++) {
				int res1=Friend.FrndPair(i);
				int res2=Friend.FrndPair(b);
				if(i/res1==b/res2) {
					System.out.println(i+" and "+b);
				}
			}
		}
	}

}

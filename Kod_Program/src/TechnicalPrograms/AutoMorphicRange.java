package TechnicalPrograms;
import java.util.Scanner;
class AutoMoic{
	static boolean AutoMorRange(int num) {
		int sq=num*num;
		while(num!=0) {
			if(num%10!=sq%10) {
				return false;
			}
			num=num/10;
			sq=sq/10;
		}
		return true;
	}
}
public class AutoMorphicRange {
	public static void main(String[] args) {
		System.out.println("enter the range of numbers to find AutoMorphic Number");
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();
		int b= scan.nextInt();
		for(int i=a;i<=b;i++) {
			boolean res=AutoMoic.AutoMorRange(i);
			if(res==true) {
				System.out.println(i+" is AutoMorphic Number");
			}
		}
	}

}

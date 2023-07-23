package TechnicalPrograms;
import java.util.Scanner;
class AutoMorNum{
	static boolean AutoMorphic(int num){
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

public class AutoMorphic {
	public static void main(String[] args) {
	    System.out.println("enter the number to find AutoMorphic or not");
	    Scanner scan = new Scanner(System.in);
	    int num=scan.nextInt();
	    boolean res =AutoMorNum.AutoMorphic(num);
	    if (res==true) {
	    	System.out.println("the entered number is automorphic number");
	    }
	    else {
	    	System.out.println("the entered number is not automorphic number");
	    }   
	}
}

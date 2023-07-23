package Array;

import java.util.Scanner;

public class Array_Inputfromuser_printit {

	public static void main(String[] args) {
		System.out.println("Enter the Array Length");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] Array1=new int[n];
		System.out.println("plz enter the data into Array");
		for(int i=0;i<=n-1;i++) {
			Array1[i]=scan.nextInt();
		}
		System.out.println("the Entered Numbers are");
		for(int i=0;i<=n-1;i++) {
			System.out.print(Array1[i]+" ");
		}
	}

}

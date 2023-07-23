package Array;

import java.util.Scanner;

public class Array_copy_reverse_order {

	public static void main(String[] args) {
		System.out.println("Enter the array length");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter the array values/data");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println(" array data entered by user");
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println(" reversed array data is");
		int arr2[]=new int[arr1.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[j]=arr1[i];
			j--;
		}
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.println(arr2[i]);
		}
	}

}

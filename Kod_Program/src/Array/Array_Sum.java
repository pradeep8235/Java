package Array;

import java.util.Scanner;

public class Array_Sum {

	public static void main(String[] args) {
		System.out.println("Enter the length of the array");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter the data/values for the array");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("Entered data  is");
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("array data entered by user");
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.println(arr1[i]);
		}
		int max=arr1[0];
		for(int i=0;i<=arr1.length-1;i++) {
			if(arr1[i]>max) {
				max=arr1[i];
			}
		}
		System.out.println("Greatest number in an Array is  "+max);
	}

}

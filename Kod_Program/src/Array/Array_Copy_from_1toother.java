package Array;

import java.util.Scanner;

public class Array_Copy_from_1toother {

	public static void main(String[] args) {
		System.out.println("Enter the size/length for first Array ");
		Scanner scan =new Scanner(System.in);
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter the data/values for first Array ");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("the values of first Array is ");
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("After copying from Array1 to Array2 ");
		int arr2[]=new int[arr1.length];
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=arr1[i];
			System.out.print(arr2[i]+" ");

		}
		


	}

}

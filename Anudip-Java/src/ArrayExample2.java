import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] a = new int[100]; // Array Memory Allocation
		int n,sum=0;
		Scanner din = new Scanner(System.in);
		System.out.println("How Many Number of Elements to Enter");
		n=din.nextInt();
		System.out.println("Enter " + n + " Values");
		for(int i=0;i<n;i++)
		{
			a[i]=din.nextInt();
		}
		System.out.println("Entered Values Are....");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"  ");
		}
		for(int i=0;i<n;i++)
		{
			sum = sum + a[i];
		}
		System.out.println("Result " + sum);
	}

}

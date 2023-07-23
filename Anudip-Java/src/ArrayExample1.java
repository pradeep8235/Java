import java.util.Arrays;

public class ArrayExample1 {

	public static void main(String[] args) {
	
		int[] a= {45,745,3,75,2,8,45,98,2}; // Array initilization
		// a[0]=45,a[1]=745,a[2]=3,a[3]=75..........a[8]
		int n=a.length;
		System.out.println("Array Length " + n);
		
		System.out.println("Before Sort");
		for(int i=0;i<n;i++) 
		{
			System.out.print(a[i]+"  ");
		}
		Arrays.sort(a);// Built in Class
		System.out.println("\nAfter Sort");
		for(int i=0;i<n;i++) 
		{
			System.out.print(a[i]+"  ");
		}

	}

}

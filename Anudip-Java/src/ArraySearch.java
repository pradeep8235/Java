import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		 
		int[]  a = {45,78,2,144,65,121,10,8};
		//int check=0;
		boolean found = false;
		int search;
		int n = a.length;
		System.out.println("Length of Array " + n);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+"  ");
		}
		System.out.println("\nEnter Element To Search");
		Scanner din = new Scanner(System.in);
		search = din.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==search)
			{
				found=true;
				//check = 1;
				break;
			}
		}
		if(found)
		{
			System.out.println("Element Found");
		}
		else
		{
			System.out.println("Element Not Found");
		}

	}

}

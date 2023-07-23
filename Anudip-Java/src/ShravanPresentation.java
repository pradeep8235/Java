import java.util.Scanner;
import java.util.*;
public class ShravanPresentation {

	public static void main(String[] args) {
		
		int[] arr = {65,120,35,47,120,34,120,86}; // Array Blocks
		int search;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("  "+arr[i]);
		}
		Scanner din = new Scanner(System.in);
		System.out.println("\nEnter Element To Search");
		search = din.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				a.add(i); // Inserting element in arrayList
			}
		}
		int count=a.size(); // To Find Size of arrayList
		if(count>0)
		{
			System.out.println("Element is Found in location "+ a);
			System.out.println("No Of Times Available " + count);
		}
		else
		{
			System.out.println("Element is Not Found");
		}
	}

}

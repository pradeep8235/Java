package ExceptionHandling;

import java.util.Scanner;

public class Example1_AE {

	public static void main(String[] args) {
		
		int x,y,z;
		Scanner din = new Scanner(System.in);
		System.out.println("Enter x and y values");
		x = din.nextInt();
		y = din.nextInt();
		try  //  try is a keyword
		{
			z = x / y;
			System.out.println("Result " + z);
		}
		catch(Exception exp)	// Method Name
		{
			exp.printStackTrace();
		}

	}

}

package PolyMorphism;

class Account	// class
{
	int check(int a) //  Same Method 1, Integer Parameter
	{
		return a;
	}
	double check(double b) // Same Method 2,Double Parameter
	{
		return b;
	}
	String check(String c) // Same Method 3,String Parameter
	{
		return c;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		System.out.println(a1.check(15));
		System.out.println(a1.check(12.55));
		System.out.println(a1.check("DeepTech"));
		
	}

}

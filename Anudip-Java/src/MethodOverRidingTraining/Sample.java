package MethodOverRidingTraining;
class First	// Base class
{
	int x,y;
	First(int a,int b)	// Constructor
	{
		x=a;
		y=b;
	}
	void printdata()
	{
		System.out.println("Value of a is " + x);
		System.out.println("Value of b is " + y);
	}
}
class Second extends First	// Derived class
{
	int z;
	Second(int a,int b,int c)
	{
		super(a,b); // Super() Method
		z=c;
	}
	void printdata()
	{
		super.printdata();
		System.out.println("Value of z is " + z);
	}
	
}
public class Sample {

	public static void main(String[] args) {
		
		Second s = new Second(10,20,30);
		s.printdata();
		
	}

}

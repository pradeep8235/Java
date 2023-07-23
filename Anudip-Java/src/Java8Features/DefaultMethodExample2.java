package Java8Features;

abstract class vehicle1		// Base class  or Super class or Existing class
{
	abstract void ride();
	//{
		//System.out.println("My Vehicle");
		//c.ride();
		//b.ride();
	//}
	/*void ride(bike b)
	{
		//System.out.println("My Vehicle");
		b.ride();
	}*/
}
class car1 extends vehicle1	// Derived class 1
{
	void ride()
	{
		System.out.println("Car Ride");
	}
}
class bike1 extends vehicle1	// Derived class 2
{
	void ride()
	{
		System.out.println("Bike Ride");
	}
}
public class DefaultMethodExample2 {

	public static void main(String[] args) {
		//vehicle v = new vehicle();
		car1 c = new car1();
		bike1 b = new bike1();
		c.ride();
		b.ride();
		//v.ride(c,b);	// Is it Correct Format ???????
		//v.ride(b);
	}
}

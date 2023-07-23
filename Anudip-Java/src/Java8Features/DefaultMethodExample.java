package Java8Features;

class vehicle		// Base class  or Super class or Existing class
{
	void ride(car c,bike b)
	{
		//System.out.println("My Vehicle");
		c.ride();
		b.ride();
	}
	/*void ride(bike b)
	{
		//System.out.println("My Vehicle");
		b.ride();
	}*/
}
class car extends vehicle	// Derived class 1
{
	void ride()
	{
		System.out.println("Car Ride");
	}
}
class bike extends vehicle	// Derived class 2
{
	void ride()
	{
		System.out.println("Bike Ride");
	}
}
public class DefaultMethodExample {

	public static void main(String[] args) {
		vehicle v = new vehicle();
		car c = new car();
		bike b = new bike();
		//c.ride();
		//b.ride();
		v.ride(c,b);	// Is it Correct Format ???????
		//v.ride(b);
	}
}

package Java8Features;

interface shiva
{
	 int x=10;		// Consider final variable 
	 void ride();	// Method declaration : yes: Consider Abstract method
	default void common(shiva k,shiva p,shiva g) // default Method
	{
		k.ride();
		p.ride();
		p.ride();

	}
}
class kathik implements shiva
{
	public void ride()
	{
		System.out.println("Karthik Ride");
	}
}
class pradeep implements shiva
{
	public void ride()
	{
		System.out.println("Pradeep Ride");
	}
}
class gagan implements shiva
{
	public void ride()
	{
		System.out.println("Gagan Ride");
	}
}
public class DefaultMethodLast {

	public static void main(String[] args) {
		shiva k = new kathik();
		shiva p = new pradeep();
		shiva g = new gagan();
		//c.ride();
		//b.ride();
		k.common(k,p,g);
		
	}

}

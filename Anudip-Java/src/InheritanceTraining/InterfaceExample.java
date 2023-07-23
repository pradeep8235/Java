package InheritanceTraining;

interface Windows7
{
	int Cid = 100;	// Member Variable declaration & Initilization
	void Win7Features(); // Method declaration 1
}
interface Windows8
{
	void Win8Features(); // Method declaration 2
}
class OperatingSystem	// Base class
{
	void Company()
	{
		
		System.out.println("Microsoft Operating System");
	}
}
class NewOperatingSystem extends OperatingSystem implements Windows7,Windows8 
{
	// Derived class
	public void Win7Features()
	{
		System.out.println(Cid);
		System.out.println("advancements in touch, speech and handwriting recognition");
	}
	public void Win8Features()
	{
		System.out.println("support for USB 3.0, Advanced Format, near-field communication, and cloud computing");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		
		NewOperatingSystem NOS = new NewOperatingSystem();
		NOS.Company();	
		NOS.Win7Features();
		NOS.Win8Features();
	}

}

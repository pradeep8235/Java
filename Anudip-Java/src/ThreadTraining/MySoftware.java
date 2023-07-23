package ThreadTraining;

class Instragram extends Thread
{
	public void run()
	{
		System.out.println("Instragram Update Starts..First");
	}
}
class Facebook extends Thread
{
	public void run()
	{
		System.out.println("Facebook Update Starts..Third");
	}
}
class Twitter extends Thread
{
	public void run()
	{
		System.out.println("Twitter Update Starts..Second");
	}
}
public class MySoftware {

	public static void main(String[] args) {
		Instragram i = new Instragram();
		Facebook f = new Facebook();
		Twitter t = new Twitter();
		i.setPriority(10);
		t.setPriority(5);
		f.setPriority(1);
		i.start();
		f.start();
		t.start();

	}

}

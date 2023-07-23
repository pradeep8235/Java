package ThreadTraining;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++) // 5<=5
		{
			System.out.println("For Loop i " + i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++) // 5<=5
		{
			System.out.println("For Loop j " + j);
		}
	}
}
class C extends Thread
{
	public void run()
	{
		for(int k=1;k<=5;k++) // 5<=5
		{
			System.out.println("For Loop k " + k);
		}
	}
}
public class EveryClassThread {
	
	public static void main(String args[])
	{
		A at = new A();
		B bt = new B();
		C ct = new C();
		at.setPriority(10);
		bt.setPriority(5);
		ct.setPriority(1);
		at.start();
		bt.start();
		ct.start();
	}

}

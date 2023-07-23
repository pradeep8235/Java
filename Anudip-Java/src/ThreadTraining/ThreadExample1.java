package ThreadTraining;
// Using Thread class
public class ThreadExample1 extends Thread {
	
	public void run()
	{
		System.out.println("Thread is Running ....");
	}

	public static void main(String[] args) {
		
		ThreadExample1 te = new ThreadExample1();
		te.start();

	}

}

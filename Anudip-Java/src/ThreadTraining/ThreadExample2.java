package ThreadTraining;
// Runnable interface
public class ThreadExample2 implements Runnable {
	
	public void run()
	{
		System.out.println("Thread is Running ....");
	}

	public static void main(String[] args) {
		
		ThreadExample2 te = new ThreadExample2();
		te.run();

	}

}

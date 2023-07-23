package ThreadTraining;

public class ThreadExample3 extends Thread {
	public void run()
	{
		System.out.println("Thread is Running !!!s");
	}

	public static void main(String[] args) {
		
		ThreadExample3 te = new ThreadExample3();
		te.start();
		System.out.println(te.getName());
		System.out.println(te.getPriority());
		// Normal Pripority 5 points
		
		te.setName("Welcome Thread");
		System.out.println(te.getName());

	}

}

package ThreadTraining;

public class Workers extends Thread {

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				try {
					Thread.sleep(5000);
		
					// Thread.yield(); 
					// Yield() to run a thread after the sleep time
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			System.out.println(i);
			if(i==7)
			{
				 stop(); // Stop Your Currently running thread
				
			}
			
		}
	}
}

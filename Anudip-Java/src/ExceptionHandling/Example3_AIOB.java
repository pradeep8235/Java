package ExceptionHandling;

public class Example3_AIOB {

	public static void main(String[] args) {
		
		int[] a = new int[3];
		try
		{
			a[0]=10;
			a[1]=20;
			a[2]=30;
			System.out.println(a[50]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

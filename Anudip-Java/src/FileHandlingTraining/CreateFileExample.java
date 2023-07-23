package FileHandlingTraining;

import java.io.*;	// In
public class CreateFileExample {

	public static void main(String[] args) {
		
		//File cf = new File("Test.txt");
		File cf = new File("C:\\Users\\welcome\\Desktop\\world\\DeepTech.pdf");
		try
		{
			if(cf.createNewFile())
			{
				System.out.println("File Created Success");
			}
			else
			{
				System.out.println("File Already Exists");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

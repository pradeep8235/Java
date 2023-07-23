package FileHandlingTraining;
import java.io.*;
public class DeleteHandlingExp {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\welcome\\Desktop\\world\\DeepTech.txt");
		try
		{
			if(f.delete())
			{
				System.out.println("File Deleted Sucess");
			}
			else
			{
				System.out.println("File not Avaialbe");
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}

	}

}

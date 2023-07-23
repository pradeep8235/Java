package FileHandlingTraining;
import java.io.File;

public class GetInformationFileExample
{
	public static void main(String args[])
	{
		try
		{
			//FileReader fr = new FileReader("C:\\Users\\welcome\\Desktop\\world\\Deeptech.txt");
			File fobj = new File("C:\\Users\\welcome\\Desktop\\world\\Deeptech.txt");
			System.out.println("File Name " + fobj.getName());
			System.out.println("File Path " + fobj.getAbsolutePath());
			System.out.println("File Access To read ? " + fobj.canRead());
			System.out.println("File Access To Wrikte ? " + fobj.canExecute());
			System.out.println("Length of the file " + fobj.length());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}

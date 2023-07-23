package FileHandlingTraining;
import java.io.FileWriter;
public class WriteFileExample {

	public static void main(String[] args) {
		
		try
		{
			FileWriter fw = new FileWriter("C:\\Users\\welcome\\Desktop\\world\\Deeptech.txt");
			fw.write("Welcome to Java Programming");
			fw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

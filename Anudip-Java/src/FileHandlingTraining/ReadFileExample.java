package FileHandlingTraining;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class ReadFileExample {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\welcome\\Desktop\\world\\DeepTech.txt");
			Scanner din = new Scanner(fr);
			while(din.hasNext())
			{
				String data = din.nextLine();
				System.out.println(data);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

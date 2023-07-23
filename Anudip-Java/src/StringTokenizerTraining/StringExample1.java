package StringTokenizerTraining;
import java.util.StringTokenizer;
public class StringExample1 {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("Welcome-to-DeepTech","-");
		// To Count Total Number of Tokens 
		System.out.println("Total number of Tokens "+ st.countTokens());
		while(st.hasMoreElements()) // True
		{
			System.out.println(st.nextToken());
		}

	}

}

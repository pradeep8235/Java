import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		int age,experience;
		String degree;
		Scanner din = new Scanner(System.in); // InputStream
		System.out.println("Enter Candidate Age");
		age=din.nextInt();
		if(age>=20 && age<=40)// 21 >= 20     21<=40
		{
			System.out.println("Enter Candidate Degree");
			degree = din.next();
			if(degree.equals("bca") || degree.equals("bcom"))
			{
				System.out.println("Enter Candidate Experience");
				experience = din.nextInt();
				if(experience>=1 && experience<=5)
				{
					System.out.println("Dear Candidate, You have shortlisted for interview");
				}
				else
				{
					System.out.println("Experience is not valid");
				}
			}
			else
			{
				System.out.println("Degree is not valid");
			}
		}
		else
		{
			System.out.println("Age is Not Valid");
		}
	}

}

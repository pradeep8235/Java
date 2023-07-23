import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		String stuId;
		String stuName;
		int mark1,mark2,mark3,total;
		double avg;
		String result,grade;
		Scanner din = new Scanner(System.in);
		System.out.println("Enter Student Id");
		stuId = din.next();
		System.out.println("Enter Student Name");
		stuName = din.next();
		System.out.println("Enter 3 Subject Marks");
		mark1 = din.nextInt();
		mark2 = din.nextInt();
		mark3= din.nextInt();
		total = mark1 + mark2 + mark3;
		avg = total / 3;
		// If Else Part
		if(mark1>=35 && mark2>=35 && mark3>=35)
		{
			result ="Pass"; // True Block 1
		}
		else
		{
			result = "Fail"; // False Block 1
		}
		// Ladder If Part
		if(avg>=90) // Driving lic
		{
			grade="A";
		}
		else if(avg>=78) // Aadhar card
		{
			grade="B";
		}
		else if(avg>=56) //Pan card
		{
			grade="C";
		}
		else if(avg>=35) // Marksheet
		{
			grade="D";
		}
		else
		{
			grade="Nil";
		}
		System.out.println("*******************************************");
		System.out.println("Student ID " + stuId);
		System.out.println("Student Name " + stuName);
		System.out.println("Mark1\tMark2\tMark3\tTotal\tAverage\tResult\tGrade");
		System.out.println(mark1+"\t"+mark2+"\t"+mark3+"\t"+total+"\t"+avg+"\t"+result+"\t"+grade);
		System.out.println("*******************************************");
	}

}

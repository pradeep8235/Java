import java.util.Scanner;

public class ArrayExample5 {
	int sid;
	String stuName;
	int mark1,mark2,mark3,total;
	double avg;
	String result,grade;
	ArrayExample5(int id,String sname,int m1,int m2,int m3)	//  Constructor with arguments
	{
		sid = id;
		stuName = sname;
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
	}
	void calculate()
	{
		total = mark1+mark2+mark3;
		avg = total / 3;
		if(mark1>=35 && mark2>=35 && mark3>=35)
		{
			result="Pass";
		}
		else
		{
			result="Fail";
		}
		if(avg>=90)
		{
			grade="A";
		}
		else if(avg>=76)
		{
			grade="B";
		}
		else if(avg>=58) {
			grade="C";
		}
		else if(avg>=35)
		{
			grade="D";
		}
		else
		{
			grade="-";
		}
		System.out.println("********************************");
		System.out.println("Student Id " + sid);
		System.out.println("Student Name " + stuName);
		System.out.println("Mark1\tMark2\tMark3\tTotal\tAverage\tGrade\tResult");
		System.out.println(mark1+"\t"+mark2+"\t"+mark3+"\t"+total+"\t"+avg+"\t"+grade+"\t"+result);
		
	}

	public static void main(String[] args) {
		
		ArrayExample5[] s = new ArrayExample5[100]; // To Create 100 s[0],s[1]......s[99]
		int n;
		int id;
		String name;
		int m1,m2,m3;
		Scanner din =new Scanner(System.in);
		System.out.println("How Many Number of Student Information To Enter");
		n=din.nextInt();
		System.out.println("Enter "+n+" Students");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Student Id ");
			id=din.nextInt();
			System.out.println("Enter Student Name ");
			name=din.next();
			System.out.println("Enter 3 Subjects");
			m1=din.nextInt();
			m2=din.nextInt();
			m3=din.nextInt();
			s[i]=new ArrayExample5(id,name,m1,m2,m3);
		}
		for(int i=0;i<n;i++)
		{
			s[i].calculate();
		}
	}

}

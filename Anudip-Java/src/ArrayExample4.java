
public class ArrayExample4 {
	int sid;
	String stuName;
	int mark1,mark2,mark3,total;
	double avg;
	String result,grade;
	// class Instance Member Variable 
	ArrayExample4(int id,String sname,int m1,int m2,int m3)
	{
	sid = id;
	stuName = sname;
	mark1=m1;
	mark2=m2;
	mark3=m3;
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
		
		ArrayExample4 s1=new ArrayExample4(100,"Sreekar",55,66,77);
		s1.calculate(); // Calling Method definition
	}

}

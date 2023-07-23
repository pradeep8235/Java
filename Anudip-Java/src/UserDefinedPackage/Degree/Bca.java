package UserDefinedPackage.Degree;

public class Bca {

	String collegeName;
	String studentName;
	String department,result;	// Class Instance variable
	public Bca(String cn,String sn,String d,String r) // Constructor
	{
		collegeName = cn;
		studentName = sn;// Constructor initilization
		department = d;
		result = r;
	}
	public void display()
	{
		System.out.println("College Name " + collegeName);
		System.out.println("Student Name " + studentName);
		System.out.println("Department " + department);
		System.out.println("Result " + result);
	}

}

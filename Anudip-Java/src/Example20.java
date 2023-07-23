
public class Example20 {
	int empid;
	String empname;
	String designation;
	double salary; 
	// Class Instance Member Variables //
	Example20(int id,String emp,String des,double sal) 
			// Constructor With Arguments /  Constructor with Arguments
	{	
		empid = id;
		empname = emp;
		designation = des;
		salary = sal;
	}
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(designation);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		
		Example20 emp1 = new Example20(100,"Sathish","Hr",38500.25);
		emp1.display();
	}

}

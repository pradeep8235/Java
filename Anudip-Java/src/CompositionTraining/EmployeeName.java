package CompositionTraining;

public class EmployeeName {
	String empName;
	EmployeeDob db; // Another class
	EmployeeName(String en,EmployeeDob doj)
	{
		empName = en;
		db = doj;
	}
	
	void display()
	{
		System.out.println("EmpName " + empName);
		db.display1();
	}

}

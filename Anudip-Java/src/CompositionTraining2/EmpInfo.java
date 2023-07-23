package CompositionTraining2;

public class EmpInfo {
	String Empid,Empname,designation; // Class Instance member variable
	EmpSalary emp2;
	EmpExperience emp3;
	EmpInfo(String eid,String en,String des,EmpSalary e2,EmpExperience e3)	// Constructor
	{
		Empid = eid;
		Empname = en;
		designation = des;
		emp2 = e2;
		emp3 = e3;
	}
	void details1()
	{
		System.out.println("Employee Id " + Empid);
		System.out.println("Employee Name " + Empname);
		System.out.println("Employee designation " + designation);
		emp2.details2();
		emp3.details3();
	}
}

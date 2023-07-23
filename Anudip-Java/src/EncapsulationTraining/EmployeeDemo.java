package EncapsulationTraining;

class EmpData
{
	 int empId=100;
	 String empName="Lokesh";
	 Double salary=18500.00;
	// Class Instance Member Variable
	// By default public access specifier
}

public class EmployeeDemo {

	public static void main(String[] args) {
		
EmpData ed = new EmpData();	// Object Created
System.out.println(ed.empId);
System.out.println(ed.empName); // Data members can be accessible
System.out.println(ed.salary);
	}
}

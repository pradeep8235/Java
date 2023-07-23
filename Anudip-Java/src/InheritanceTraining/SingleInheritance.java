package InheritanceTraining;

class Employee		// Base class or Existing class
{
	int empId;
	String empName;	// Class instance member variables 
	Employee(int eid,String en)		// Base class Constructor
	{
		empId = eid;
		empName = en;
	}
}
class information extends Employee // Derived class or Sub-class
{
	double salary;
	information(int eid,String en,double sal)	// Derived class constructor
	{
		super(eid,en);
		salary = sal;
		/*How to Passing an argument from derived class constructor
		 to base class cconstructor
		 */	
	}
	void display()
	{
		System.out.println("Employee Id " + empId);
		System.out.println("Employee Name " + empName);
		System.out.println("Employee Salary " + salary);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		information info = new information(100,"Lokesh",38500);
		info.display();
	}

}

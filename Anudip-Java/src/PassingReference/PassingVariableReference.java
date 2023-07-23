package PassingReference;
import java.util.*;
// Passing Variable reference to Methods
class Employee
{
	int empId;
	String empName;
	double empSalary;
	String empDesignation;
	Employee(int empId,String empName,double empSalary,String empDesignation)	// Constructor
	{
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
	}
	
	void printdata()
	{
		System.out.println("Employee Id " + empId);
		System.out.println("Employee Name " + empName);
		System.out.println("Employee Salary " + empSalary);
		System.out.println("Employee Designation " + empDesignation);
	}
}

public class PassingVariableReference {

	public static void main(String[] args) {
		int eid;
		String ename;
		double sal;
		String des;
		Scanner din = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		eid = din.nextInt();
		System.out.println("Enter Employee Name");
		ename = din.next();
		System.out.println("Enter Employee Salary");
		sal = din.nextDouble();
		System.out.println("Enter Employee Designation");
		des = din.next();
		Employee e = new Employee(eid,ename,sal,des); // Passing variable Reference to methods[con]
		e.printdata();

	}

}

package CompositionTraining2;

public class EmpSalary {

	String mobileno;
	double salary;			// Class instance member variable
	
	EmpSalary(String mob,double sal)
	{
		mobileno = mob;
		salary = sal;
	}
	void details2()
	{
		System.out.println("Employee Mobile " + mobileno);
		System.out.println("Employee salary " + salary);
	}
}

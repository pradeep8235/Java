package ThisKeywordTraining;

public class Example2 {
	int empId;
	String empName,Designation;
	double salary;
					// Class Instance Member Variable
	Example2 account(int empId,String empName,String Designation,double salary)
	{
		this.empId = empId;
		this.empName = empName;
		this.Designation = Designation;
		this.salary = salary;
		return this;
	}
	Example2 account(int empId,String empName,String Designation)
	{
		this.empId = empId;
		this.empName = empName;
		this.Designation = Designation;
		return this;
	}
	Example2 account(int empId,String Designation)
	{
		this.empId = empId;
		this.Designation = Designation;
		return this;
	}
	void display()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(Designation);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		
		Example2 emp1 = new Example2();
		emp1.account(100,"Kiran","DeepTech-Java",1500.00);
		emp1.display();
		emp1.account(101,"Shravan","DeepTech-Java");
		emp1.display();
		emp1.account(102,"Shravan","DeepTech-Aws");
		emp1.display();
	}

}

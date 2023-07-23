
public class Example21 {
	int empid;
	String firstname,lastname,designation;
	double salary;
	void action()	// Method without parameter
	{
		empid =100;
	}
	void action(String f,String  l) // Method with Double parameter
	{
		firstname = f;
		lastname = l;
	}
	void action(String des,double sal) // Method with double Parameter
	{
		designation = des;
		salary = sal;
	}
	void display()
	{
		
		System.out.println("Employee Id " + empid);
		System.out.println("Employee FirstName " + firstname);
		System.out.println("Employee LastName " + lastname);
		System.out.println("Employee Designation " + designation);
		System.out.println("Employee salary " + salary);
	}

	public static void main(String[] args) {
		Example21 emp =  new Example21();
		emp.action();
		emp.action("Lokesh", "Raj");
		emp.action("Hr",38500.25);
		emp.display();
	}

}

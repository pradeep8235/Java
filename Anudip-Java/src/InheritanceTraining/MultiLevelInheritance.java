package InheritanceTraining;

class CompanyInfo	// Base class
{
	int companyId;
	String CompanyName;
	String Location;
	CompanyInfo(int cid,String cn,String l)
	{
		companyId = cid;
		CompanyName = cn;
		Location = l;
	}
}
class EmployeeInfo extends CompanyInfo	// Sub-level 1
{
	String empCode,empName;
	String designation;
	EmployeeInfo(int cid,String cn,String l,String ec,String en,String des)
	{
		super(cid,cn,l);
		empCode = ec;
		empName = en;
		designation = des;
	}
}
class SalaryInfo extends EmployeeInfo	// Derived class
{
	double salary;
	SalaryInfo(int cid,String cn,String l,String ec,String en,String des,double sal) // Derived class Constructor
	{
		super(cid,cn,l,ec,en,des); 
		salary = sal;
	}
	void getReport()
	{
		System.out.println("***** Employee Report *******");
		System.out.println("Company Id " + companyId);
		System.out.println("Company Name " + CompanyName);
		System.out.println("Company Location " + Location);
		System.out.println("Employee Code " + empCode);
		System.out.println("Employee Name " + empName);
		System.out.println("Employee Designation " + designation);
		System.out.println("Employee salary " + salary);
		
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		SalaryInfo si = new SalaryInfo(100,"Anudip","Bangalore","ANP001","Kiran","Developer",45000);
		si.getReport();
		
	}

}

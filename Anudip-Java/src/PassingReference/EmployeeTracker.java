package PassingReference;
import java.util.*;
class EmployeeT
{
	int empId;
	String empName;
	double rating;
	String status;
	// class Instance Member Variables
	EmployeeT(int empId,String empName,double rating)	// Constructor
	{
		this.empId = empId;
		this.empName = empName;
		this.rating = rating;
	}
	void calculate()
	{
		if(rating==3)
		{
			status = "Excellent";
		}
		else if(rating==2.5)
		{
			status = "Above Average";
		}
		else if(rating==2.0)
		{
			status = "Average";
		}
		else if(rating==1.5)
		{
			status = "Below Average";
		}
		else if(rating==1.0)
		{
			status = "Worst";
		}
		else 
		{
			status =null;
		}
		
	}
	void display()
	{
		System.out.println("*******************************");
		System.out.println("Employee Id " + empId);
		System.out.println("Employee Name " + empName);
		System.out.println("Employee Rating " + rating);
		System.out.println("Status " + status);
	}
}

public class EmployeeTracker {

	public static void main(String[] args) {
		
		int eid;
		String ename;
		double rat;
		int n;
		Scanner din= new Scanner(System.in);
		System.out.println("How Many Number of Employee Records");
		n = din.nextInt();	// Example 4 Employee
		System.out.println("Start Entering " + n + " Datas");
		EmployeeT[] e = new EmployeeT[n]; // $ Objects Created 
		for(int i=0;i<n;i++)	// 4 Times Loop
		{
			System.out.println("Enter Employee Id ");
			eid = din.nextInt();
			System.out.println("Enter Employee Name ");
			ename = din.next();
			System.out.println("Enter Employee Rating ");
			rat = din.nextDouble();
			e[i] = new EmployeeT(eid,ename,rat); // e[0],e[1],e[2],e[3]
		}
		for(int i=0;i<n;i++)
		{
			e[i].calculate();
		}
		for(int i=0;i<n;i++)
		{
			e[i].display();
		}

	}

}

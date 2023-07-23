package CompositionTraining;

public class EmployeeDob {
	int day,month,year;
	
	EmployeeDob(int d,int m,int y)
	{
		day = d;
		month = m;
		year = y;
	}
	void display1()
	{
		System.out.println(day+" /" + month +" /" + year);
	}

}

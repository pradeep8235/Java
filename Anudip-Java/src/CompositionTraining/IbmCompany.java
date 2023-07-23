package CompositionTraining;

public class IbmCompany {

	public static void main(String[] args) {
		
		EmployeeDob d = new EmployeeDob(5,10,2000);
		EmployeeName e = new EmployeeName("Mahesh",d);
		e.display();
	}

}

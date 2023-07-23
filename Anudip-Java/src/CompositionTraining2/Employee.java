package CompositionTraining2;

public class Employee {

	public static void main(String[] args) {
		
		EmpSalary emp2 = new EmpSalary("+91-8892700779",48500.25);
		EmpExperience emp3 = new EmpExperience("Spring Boot",4);
		EmpInfo emp1 = new EmpInfo("IBM001","Gagan","Developer",emp2,emp3);
		emp1.details1();
	}

}

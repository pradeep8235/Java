package EncapsulationTraining;

class EmpData1
{
	private int empId;
	private String empName;
	private Double empSalary;
	// Class Instance Member variables
	// To Passing an argument by using constructor or [ Getter,Setter ]
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	
}
public class EmployeeData1 {

	public static void main(String[] args) {
		
		EmpData1 ed = new EmpData1();
		ed.setEmpId(100); // Argument or Parameter
		ed.setEmpName("Lokesh");
		ed.setEmpSalary(25000.0);
		System.out.println("Employee Id " + ed.getEmpId());
		System.out.println("Employee Name " + ed.getEmpName());
		System.out.println("Employee Salary " + ed.getEmpSalary());
	}

}

package ThisKeywordTraining;

public class Example1 {
	int empId;
	String empName;
	// Class instance member variable
	Example1(int empId,String empName) // Constructor
	{
		this.empId = empId;
		this.empName = empName;
	}
	void display() {
		System.out.println(empId);
		System.out.println(empName);
	}

	public static void main(String[] args) {
		
		Example1 e1 = new Example1(100,"Sethu"); // Object Created
		e1.display();
	}

}

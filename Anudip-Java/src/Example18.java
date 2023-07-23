
public class Example18 {
	int empid = 100; // (int) datatype - empid(variable) - (100) values
	String empname ="Sathish"; // (String) Class  - empname(Object) - "Sathish" Literals 
	Example18()	// Default Constructor
	{
		System.out.println(empid);
		System.out.println(empname);
	}

	public static void main(String[] args) {
		
			new Example18(); // It's Correct , It will call Constructor
				// Without Object With Memory Block
			Example18 e1 = new Example18(); // Memory Address created for Object
	}

}


public class Example19 {
	int x; // Class Member Instance Variable 
	Example19(){
		x=10; // Variable initilization
	}
	void incre() // User-defined Method
	{
		x++;
	}
	void display()	// User-defined mnethod
	{
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		Example19 e1	= new Example19();
		Example19 e2	= new Example19();
		Example19 e3	= new Example19();
		Example19 e4	= new Example19();
		e1.incre();
		e2.incre();
		e2=e1;
		e3.incre();
		e3=e2;
		e3.incre();
		e4=e3;
		// To Print  x values
		e4.incre();
		e1.display();
		e2.display();
		e3.display();
		e4.display();

	}

}

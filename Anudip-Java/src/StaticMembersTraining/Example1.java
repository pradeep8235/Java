package StaticMembersTraining;

public class Example1 {
	static int sid = 100;
	static String name ="Pradeep"; // String pool 
	
	static void display()
	{
		System.out.println(sid);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
	/* Without Creating a Object How To Access class members?
		Example1 e = new Example1(); // Object Creation
		e.display();
		*/
		display();
	}

}

import java.util.Scanner;

public class Example22 {
	int product_id;
	double product_price;
	String product_name;		// Class Instance Member Variables
	Example22()					// Constructor without Arguments or default cons
	{
		product_id = 1;
		product_price=12.55;
		product_name="Orange";
	}
	Example22(int pid)		// Constructor with Single Argument
	{
		product_id = pid;
		product_price = 14.55;
		product_name="Apple";
	}
	Example22(int pid,double pprice) // Constructor with Double Argument	
	{
		product_id = pid;
		product_price = pprice;
		product_name = "Mango";
	}
	Example22(int pid,double pprice,String pname) // Constructor with Multi-Arguments
	{
		product_id = pid;
		product_price = pprice;
		product_name = pname;
	}
	Scanner din = new Scanner(System.in);
	void update(Example22 p2) // User-defined 
	{
		int option;
		int pro_id;
		System.out.println("Please Enter Product Id To Update");
		pro_id = din.nextInt();  // 2
		//System.out.println(p2.product_id);
		if(p2.product_id==pro_id)
		{
			System.out.println("Press 1 for Change Product Price");
			System.out.println("Press 2 for Change Product Name");
			option = din.nextInt(); // 2
			switch(option)
			{
			case 1: System.out.println("Enter Product Price to Update");
					product_price = din.nextDouble();
				break;
			case 2: System.out.println("Enter Product Name to Update");
					product_name = din.next();
				break;
			default :System.out.println("Invalid Selection");
			}
		}
		else
		{
			System.out.println("Product Id is not Matched");
		}
	}
	void print()	// User-defined Method
	{
		System.out.println("Product Id : " + product_id);
		System.out.println("Product Price : " + product_price);
		System.out.println("Product Name : " + product_name);
	}
	public static void main(String[] args) {
		Example22 p1 = new Example22();
		Example22 p2 = new Example22(2);
		Example22 p3 = new Example22(3,18.45);
		Example22 p4 = new Example22(4,20.56,"Grapes");
		p1.print();
		p2.print();
		p3.print();
		p4.print();
		p2.update(p2);
		p2.print();
	}

}

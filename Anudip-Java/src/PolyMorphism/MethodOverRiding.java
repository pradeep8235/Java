package PolyMorphism;

class Triangle		// Base Class or Super Class or Existing Class or Parent Class
{
	int breadth,height;
	Triangle(int b,int h)
	{
		breadth = b;
		height = h;
	}
	void area()	// Same Method with same Argument
	{
		System.out.println("Area of Triangle " + (0.5*breadth*height));
	}
}
class Rectangle extends Triangle // Sub-Level 1
{
	int breadth,length;	// class instance variable
	Rectangle(int l,int b)	// Constructor
	{
		super(l,b);
		length =l;
		breadth = b;	
	}
	void area() // Same Method with same Argument
	{
		super.area();
		System.out.println("Area of Rectangle " + length * breadth );
	}
}
class circle extends Rectangle // Derived class or Sub-class or Child class
{
	int radius;	// class instance variable
	circle(int l,int b,int r)	// Constructor
	{
		super(l,b);
		radius = r;
	}
	void area() // Same Method with same Argument
	{
		super.area();
		System.out.println("Area of Circle " + 3.14 * radius * radius);
	}
}
public class MethodOverRiding {

	public static void main(String[] args) {
		// Hint: Object should create only for the derived class
		circle c = new circle(10,20,5);
		c.area();
	}

}

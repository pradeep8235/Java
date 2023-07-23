package UserDefinedPackage;

import UserDefinedPackage.Engg.Mechnical;
import UserDefinedPackage.Degree.Bca;
public class College {

	public static void main(String[] args) {

Mechnical m = new Mechnical("PES","Naveen","Mech","Pass");
Bca b = new Bca("Global","Kiran","bca","Pass");
m.display();
b.display();

	}

}

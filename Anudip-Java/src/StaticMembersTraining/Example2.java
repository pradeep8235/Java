package StaticMembersTraining;

class DeepTech
{
	static int branchId=1;
	static String branchName="Anudip Foundation: Malleshwaram";
	static void display()
	{
		System.out.println(branchId);
		System.out.println(branchName);
	}
}


public class Example2 {

	public static void main(String[] args) {
		
		//DeepTech dt=new DeepTech();// Creating object
		//dt.display();
		DeepTech.display();
	}

}

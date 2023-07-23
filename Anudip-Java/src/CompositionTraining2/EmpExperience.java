package CompositionTraining2;

public class EmpExperience {
	String technology;			// Class instance member variables
	int noofexperience;

	EmpExperience(String tech , int exp)
	{
		technology = tech;
		noofexperience = exp;
	}
	void details3()
	{
		System.out.println("Employee technology " + technology);
		System.out.println("Employee No Of Experience " + noofexperience);
	}
}

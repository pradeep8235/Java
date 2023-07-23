package PassingReference;
// Passing Object to Methods
class DeepTech
{
	int Alertid;
	String AlertInformation;
	 // Class instance member variables
	DeepTech(int Alertid,String AlertInformation)
	{
		this.Alertid = Alertid;
		this.AlertInformation = AlertInformation;
	}
	DeepTech(DeepTech message) // ( message -> Object )
	{
		Alertid = message.Alertid;
		AlertInformation = message.AlertInformation;
	}
	void display()
	{
		System.out.println("Alert Id " +Alertid );
		System.out.println("Alert Information " +AlertInformation ); 
	}
}

public class PassingObjectToMethods {

	public static void main(String[] args) {
		
		DeepTech ranjit = new DeepTech(100,"in between one intimation email will be shared after >5th consecutive absences by AE SPOC");
		ranjit.display();
		DeepTech Karthik = new DeepTech(ranjit);
		Karthik.display();
	}

}

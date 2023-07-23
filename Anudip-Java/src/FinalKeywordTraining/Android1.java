package FinalKeywordTraining;

class Marshmallow1
{
	//final void features()
	// This above method can't be OverRide if it is final void features()
	void features()
	{
		System.out.println("fingerprint-based authentication");
		System.out.println("Authenticating Play Store and Google Pay purchases");
	}
	void drawbacks()
	{
		System.out.println("WiFi Battery Drains");
		System.out.println("GPS problem");
	}
}
class Nougat1 extends Marshmallow1
{
	void features()
	{
		super.features();
		System.out.println("Split-screen mode");
		System.out.println("support for inline replies to notifications");
	}
}
public class Android1 {

	public static void main(String[] args) {
		
		Nougat1 N = new Nougat1();
		N.features();
		N.drawbacks();
		
	}

}

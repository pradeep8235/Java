package FinalKeywordTraining;

class Marshmallow2
{
	final double android_version=6.0;
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
class Nougat2 extends Marshmallow2
{
	void features()
	{
		super.features();
		System.out.println("Android Version " + android_version);
		// android_version=7.0;
		// Final variable can't be change 
		System.out.println("Split-screen mode");
		System.out.println("support for inline replies to notifications");
	}
}
public class Android2 {

	public static void main(String[] args) {
		
		Nougat2 N = new Nougat2();
		N.features();
		N.drawbacks();
		
	}

}


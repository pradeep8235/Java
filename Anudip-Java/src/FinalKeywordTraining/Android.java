package FinalKeywordTraining;

 class Marshmallow
 // Final class Marshmallow
{
	void features()
	{
		System.out.println("fingerprint-based authentication");
		System.out.println("Authenticating Play Store and Google Pay purchases");
	}
}
class Nougat extends Marshmallow
// Here : Error : Can't be extends from derived class
{
	void features()
	{
		super.features();
		System.out.println("Split-screen mode");
		System.out.println("support for inline replies to notifications");
		
	}
}
public class Android {

	public static void main(String[] args) {
		
		Nougat N = new Nougat();
		N.features();
	}

}

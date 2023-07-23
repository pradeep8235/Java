
public class CopyConstructor {
	String TransactionID;
	String MobileNo;
	double Amount;
	// Class Instance Member Variable : Declared
	CopyConstructor()	// Default Constructor or Constructor Without Arguments / Parameters
	{
		TransactionID=null;
		MobileNo=null;
		Amount=0;
	}
	CopyConstructor(String tId,String mNo,double amt) // Constructor with Arguments / Parameters
	{
		TransactionID = tId;
		MobileNo = mNo;
		Amount = amt;
	}
	CopyConstructor(CopyConstructor internet) // Copy Constructor
	{
		TransactionID = internet.TransactionID;
		MobileNo = internet.MobileNo;
		Amount = internet.Amount;
	}
	void display()
	{
		System.out.println("Transaction Id " + TransactionID);
		System.out.println("Mobile Number " + MobileNo );
		System.out.println("Amount " + Amount);
	}
	public static void main(String[] args) {
		
		CopyConstructor paytm = new CopyConstructor("TID-77896541230","+91-8892700779",1000);
		CopyConstructor sbi = new CopyConstructor(paytm); // Calling Copy Constructor
		paytm.display();
		sbi.display();
	}

}

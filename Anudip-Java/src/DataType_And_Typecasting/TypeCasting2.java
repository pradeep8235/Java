package DataType_And_Typecasting;

public class TypeCasting2 {

	public static void main(String[] args) {
		
		String[] a= {"43","645","534","7","454","8","56"};
		int sum=0;
		int n = a.length; // To Find Length of String
		for(int i=0;i<n;i++) // i=0         0<7
		{
			sum = sum + Integer.parseInt(a[i]);
			
		}
		System.out.println("Final Result " + sum);
	
	}

}

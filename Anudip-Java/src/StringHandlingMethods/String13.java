package StringHandlingMethods;

public class String13 {

	public static void main(String[] args) {
		
		String s = "welcome ";   
		String[] stringarray = s.split("|");    
		for(int i=0; i<stringarray.length; i++)  
		{  
		System.out.println(stringarray[i]);  
		}  

	}

}

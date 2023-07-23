import java.util.*;
enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY} 
public class Example25 {
	public static void main(String[] args) {
		String wn;
		Scanner din = new  Scanner(System.in);
		
		System.out.println("Enter Week Name");
		wn = din.next();
		Integer day=Day.valueOf(wn.toUpperCase()).ordinal(); 
		  System.out.println(day);
		switch(day){  
		case 0:   
		 System.out.println("sunday");  
		 break;  
		case 1:   
		 System.out.println("monday");  
		 break;  
		default:  
		System.out.println("other day"); 
		}
	}

}

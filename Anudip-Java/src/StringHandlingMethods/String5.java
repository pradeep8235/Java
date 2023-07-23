package StringHandlingMethods;

public class String5 {

	public static void main(String[] args) {
		
		String[] s = new String[100];
		s[0]="Welcome";
		s[1]="to";
		s[2]="DeepTech";
		s[3]="";
		s[4]="    ";
		s[5]=null;
		System.out.println(s[1]);
		System.out.println(s[1].length());
		System.out.println(s[3].length()); // Output : 0
		System.out.println(s[4].length()); // Output : 4
		System.out.println(s[5].length());
		

	}

}

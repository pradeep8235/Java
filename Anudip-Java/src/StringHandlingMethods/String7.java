package StringHandlingMethods;

public class String7 {

	public static void main(String[] args) {
		
String s1="Welcome to Java Programming DeepTech Bangalore";
System.out.println(s1);
String s2[]=s1.split(" ");
// s2[0]="Welcome"
// s2[1]="to"
// s2[2]="Java"
// .....
System.out.println("Total Length of s1 " + s1.length());
System.out.println(s2.length);
for(int i=0;i<s2.length;i++)
{
	System.out.println(s2[i]);
}
System.out.println("Character Position " + s1.charAt(3));
System.out.println("Character Position " + s1.charAt(2));
// Reverse String
for(int i=s1.length()-1;i>0;i--)
{
	System.out.print(s1.charAt(i));
}
	}

}

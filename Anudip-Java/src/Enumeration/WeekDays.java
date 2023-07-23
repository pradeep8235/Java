package Enumeration;
enum wd
{
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,			// Constants
	THURSDAY,
	FRIDAY,
	SATURADAY
}

public class WeekDays {

	public static void main(String[] args) {
		
wd value = wd.SUNDAY;
System.out.println(value);
System.out.println(wd.valueOf("MONDAY").ordinal());
	}

}

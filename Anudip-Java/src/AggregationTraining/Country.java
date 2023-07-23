package AggregationTraining;

class state
{
	String stateName;
	String statecode;	// Entity or class instance variable
	state(String sn,String sc)
	{
		stateName = sn;
		statecode = sc;
	}
}
class city
{
	String cityName;
	String citycode;
	state st;
	city(String cn,String cc)		// Constructor
	{
		cityName = cn;
		citycode = cc;
		st = new state("Karnataka","St01"); // Aggregation 
	}
	void display()
	{
		System.out.println("City Name " + cityName);
		System.out.println("City Code " + citycode);
		System.out.println("State Name " + st.stateName);
		System.out.println("State code " + st.statecode);
	}
}
public class Country {

	public static void main(String[] args) {
		city c = new city("Bangalore","BAN1");
		c.display();	
	}

}

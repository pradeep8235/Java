package AbstractTraining;
abstract class FinalYear				 // Abstract class
{
	abstract void SoftwareRequirements(); // Abstract Method declaration 1
	abstract void HardwareRequirements(); // Abstract Method declaration 2
	void synopsis()
	{
		System.out.println("IEEE - Based Projects 2023");
	}
}
class JavaProject extends FinalYear
{
	String projectName,Domain,frontend,backend;
	String operatingsystem,ram,harddisk,processor;
	JavaProject(String pN,String d,String fe,String be,String os,String r,String hdd,String  p)	// Constructor with arguments
	{
		projectName = pN;
		Domain = d;
		frontend = fe;
		backend = be;
		operatingsystem = os;
		ram = r;
		harddisk = hdd;
		processor = p;
	}
	 void SoftwareRequirements()
	{
		System.out.println("Project Name " + projectName);
		System.out.println("domaint " + Domain);
		System.out.println("Front End " + frontend);
		System.out.println("Back End " + backend);
	}
	 void HardwareRequirements()
	{
		 System.out.println("Project Name " + operatingsystem);
		 System.out.println("domaint " + ram);
			System.out.println("Front End " + harddisk);
			System.out.println("Back End " + processor);
	}
}
class DotNet extends FinalYear
{
	String projectName,Domain,frontend,backend;
	String operatingsystem,ram,harddisk,processor;
	DotNet(String pN,String d,String fe,String be,String os,String r,String hdd,String  p)	// Constructor with arguments
	{
		projectName = pN;
		Domain = d;
		frontend = fe;
		backend = be;
		operatingsystem = os;
		ram = r;
		harddisk = hdd;
		processor = p;
	}
	void SoftwareRequirements()
	{
		System.out.println("Project Name " + projectName);
		System.out.println("domaint " + Domain);
		System.out.println("Front End " + frontend);
		System.out.println("Back End " + backend);
	}
	void HardwareRequirements()
	{
		System.out.println("Project Name " + operatingsystem);
		 System.out.println("domaint " + ram);
			System.out.println("Front End " + harddisk);
			System.out.println("Back End " + processor);
	}
}
public class Project {

	public static void main(String[] args) {
		FinalYear fy;
		JavaProject jp = new JavaProject("OneCloud-Share","Cloud","Java","Oracle","Linux","8GB","1TB","i3 Pro");
		DotNet dp = new DotNet("ESSL","RealTime","VBNET","SQL-SERVER","Windows","4GB","250GB","i5 Pro");
		fy = jp; // Sharing Object reference from one Object to another
		jp.synopsis();
		jp.SoftwareRequirements();
		jp.HardwareRequirements();
		fy = dp;
		dp.synopsis();
		dp.SoftwareRequirements();
		dp.HardwareRequirements();


	}

}

package JavaBean;

public class Student {
	private int studentId;
	private String studentName;	// Class Instance Varaible : private
	 /* Student(int sid,String sn)	// Conctructor
{
	studentId = sid;
	studentName = sn;
}
	
*/ 
	void setId (int studentId)
	{
		this.studentId = studentId;
	}
	int getId()
	{
		return studentId;
	}
	void setName(String studentName)
	{
		this.studentName = studentName;
	}
	String getName()
	{
		return studentName;
	}
	
}

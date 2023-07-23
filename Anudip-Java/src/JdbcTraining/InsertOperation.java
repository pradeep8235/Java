package JdbcTraining;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class InsertOperation {

	public static void main(String[] args) {
		
		int student_id;
		String student_name;
		double salary;
		// Variables declaration
		Scanner din = new Scanner(System.in);
		System.out.println("Enter Student Id");
		student_id = din.nextInt();
		System.out.println("Enter Student Name");
		student_name = din.next();
		System.out.println("Enter Student Salary");
		salary = din.nextDouble();
		System.out.println("Student Id " + student_id);
		System.out.println("Student Name " + student_name);
		System.out.println("Student Salary " + salary);
		
		try
		{
// Driver mysql 8.0 Driver class 8.0 Class.forName("com.mysql.cj.jdbc.Driver");
// Assume mysql 5.0 Driver class 5.0 Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/deeptech_java", "root", "root");
			String sql="insert into student(sid,sname,salary)values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);	
			ps.setInt(1, student_id);
			ps.setString(2, student_name);
			ps.setDouble(3, salary);
			int i=ps.executeUpdate(); // After Execute if Success 1 or 0
			if(i>0)
			{
				System.out.println("Student Record inserted Success");
			}
			else
			{
				System.out.println("Sorry !!! Record Insertion Failed");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}

package JdbcTraining;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class UpdateOperation {

	public static void main(String[] args) {
		
		int employee_id;
		double employee_salary;
		Scanner din = new Scanner(System.in);
		System.out.println("Enter Employee Id ");
		employee_id = din.nextInt();
		System.out.println("Enter Salary Amount To Update");
		employee_salary = din.nextDouble();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/myteam","root","root");
			String sql="update employee set salary=? where eid =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setDouble(1, employee_salary);
			ps.setInt(2, employee_id);
			int i = ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Update Success");
			}
			else
			{
				System.out.println("Updation is failed");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

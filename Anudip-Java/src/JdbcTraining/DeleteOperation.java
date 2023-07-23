package JdbcTraining;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class DeleteOperation {

	public static void main(String[] args) {
		
		int employee_id;
		System.out.println("Enter Employee Id to delete");
		Scanner din = new Scanner(System.in);
		employee_id = din.nextInt();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/myteam","root","root");
			String query = "delete from employee where eid=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, employee_id);
			int i = ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Employee Data Deleted");
			}
			else
			{
				System.out.println("Deletion Failed");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

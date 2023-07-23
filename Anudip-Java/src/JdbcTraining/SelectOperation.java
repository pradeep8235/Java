package JdbcTraining;

import java.sql.Connection;		// Interface
import java.sql.DriverManager;	// Class
import java.sql.ResultSet;		// Interface
import java.sql.Statement;		// Interface

public class SelectOperation {

	public static void main(String[] args) {
		int employee_id;
		String employee_name;
		String employee_designation;
		double employee_salary;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/myteam","root","root");
			String sql="select * from employee";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			System.out.println("ID\tName\tDesignation\tSalary");
			while(rs.next())
			{
				employee_id= rs.getInt(1);
				employee_name = rs.getString(2);
				employee_designation = rs.getString(3);
				employee_salary = rs.getDouble(4);
System.out.println(employee_id+"\t"+employee_name+"\t"+ employee_designation +"\t" + employee_salary);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

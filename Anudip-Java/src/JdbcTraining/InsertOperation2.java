package JdbcTraining;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.PreparedStatement;
public class InsertOperation2 {

	public static void main(String[] args) {
		int employee_id;
		String employee_name;
		String employee_designation;
		double employee_salary;
		// Variables declared
		try
		{
			Scanner din = new Scanner(System.in);
			System.out.println("Enter Employee Id ");
			employee_id = din.nextInt();
			System.out.println("Enter Employee Name ");
			employee_name = din.next();
			System.out.println("Enter Employee Designation");
			employee_designation = din.next();
			System.out.println("Enter Employee Salary ");
			employee_salary = din.nextDouble();
			System.out.println("Employee Id " + employee_id);
			System.out.println("Employee Name " + employee_name);
			System.out.println("Employee Designation  " + employee_designation);
			System.out.println("Employee Salary " + employee_salary);
			Class.forName("com.mysql.cj.jdbc.Driver");// 5.0 com.mysql.jdbc.Driver
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/myteam", "root","root");
			String query="insert into employee values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, employee_id);
			ps.setString(2, employee_name);
			ps.setString(3, employee_designation);
			ps.setDouble(4, employee_salary);
			int i = ps.executeUpdate(); // 1 ( True ) or 0 ( False )
			if(i>0)
			{
				System.out.println("Data Stored Successfully");
			}
			else
			{
				System.out.println("Sorry !!! Data not Stored");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

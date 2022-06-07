package MAY10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentCRUD {


	public void saveStudent(int id,String name,String email)
	{
		String url="jdbc:mysql://localhost:3306/javabatch";
		String userName="root";
		String password="root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,userName,password);

			Statement stmt=con.createStatement();

			String sql="Insert into student values("+id+",'"+name+"','"+email+"')";
			stmt.execute(sql);
			con.close();
			System.out.println("Data Saved");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
	
			e.printStackTrace();
		}

			

	}
}

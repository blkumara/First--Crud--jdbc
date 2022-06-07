package MAY10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentDelete {


	public void deleteStudent(int id)
	{
		String url="jdbc:mysql://localhost:3306/javabatch";
		String userName="root";
		String password="root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,userName,password);

			Statement stmt=con.createStatement();

			String sql=("Delete From student where id="+id);
			stmt.execute(sql);
			con.close();
			System.out.println("Data Delete");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
	
			e.printStackTrace();
		}

			

	}
}

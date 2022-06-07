package MAY10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDetails {
public static void main(String[] args) {
	
	
	String url="jdbc:mysql://localhost:3306/javabatch";
	String userName="root";
	String password="root";
	
	String sql="Select * from student";
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection(url,userName,password);
		
		Statement stm=con.createStatement();
		
		ResultSet rs=stm.executeQuery(sql);
		while(rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String email=rs.getString(3);
			System.out.println("Id Is:"+id);
			System.out.println("Name Is:"+name);
			System.out.println("Email Is:"+email);
			System.out.println("******************");
		}
		con.close();
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}

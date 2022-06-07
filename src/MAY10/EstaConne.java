package MAY10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class EstaConne {
	public static void main(String[] args) {
		
	Driver d;
	String url="jdbc:mysql://localhost:3306/javabatch?user=root&password=root";
	
	
	String sql="insert into javabatch. student values(7,'rohith','rohith@8861')";
	
	try
	{
		d=new Driver();
		DriverManager.registerDriver(d);
		

		Connection con=DriverManager.getConnection(url);
		
		Statement stm=con.createStatement();
		
		stm.execute(sql);
		
		con.close();
		
		System.out.println("Data Inserted");
		
	}
	
	catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	
	
}
}




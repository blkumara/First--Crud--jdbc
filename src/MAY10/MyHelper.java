package MAY10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyHelper {
	
	String driver="com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/javabatch";
	private String userName="root";
	private String password="root";
	private Connection con=null;
	
	public  Connection getConnectionObj()
	{
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,userName,password);
			
		
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}


}

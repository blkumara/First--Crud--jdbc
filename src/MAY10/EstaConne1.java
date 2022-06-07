package MAY10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class EstaConne1 {
	public static void main(String[] args) {
		
	Driver d;
	String url="jdbc:mysql://localhost:3306/javabatch";
	
	String sql="insert into javabatch. student values(8,'naveen','navee@8861')";
	
	try
	{
		d=new Driver();
		DriverManager.registerDriver(d);
		
		Properties p=new Properties();
		
		
			InputStream i=new FileInputStream("mysqldb.properties");
			
				p.load(i);
				
				Connection con=DriverManager.getConnection(url);
				
				Statement stm=con.createStatement();
				
				stm.execute(sql);
				
				con.close();
				
				System.out.println("Data Inserted");
				
			}
		 catch (IOException e) {
				e.printStackTrace();
		 }
	
	catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	
	
}
}




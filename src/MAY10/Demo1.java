package MAY10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Demo1 {
	public static void main(String[] args) {
		
		Driver d;
		String url="jdbc:mysql://localhost:3306/javabatch";
		String userName="root";
		String password="root";
		
		String sql="insert into javabatch. user values(1,'Kumara','blkumara701@gmail.com','varun@9844',9844648667)";
		try
		{
			d=new Driver();
			DriverManager.registerDriver(d);
			

			Connection con=DriverManager.getConnection(url,userName,password);
			
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

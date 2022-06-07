package MAY10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class UsingProprtiesFile {

	public static void main(String[] args) {


		Properties p=new Properties();
		try {
			InputStream ip = new FileInputStream("mysqldb1.properties");
			p.load(ip);

			String url=p.getProperty("url");
			String driver=p.getProperty("driver");
			Connection con = DriverManager.getConnection(url, p);
			Class.forName(driver);
			Statement stmt = con.createStatement();
			stmt.execute("Insert Into student values(8,'rishi','rishi@.com')");
			con.close();
			System.out.println("Added");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




	}

}


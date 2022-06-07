package May14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentCrud {
	public static void main(String[] args) 
		{
		String url="jdbc:mysql://localhost:3306/javabatch";
		String userName="root";
		String password="root";
		Connection con=null;
		try {
			//System.out.println(10/0);
			DriverManager.getConnection(url,userName,password);
			String sql="Insert into student values(?,?,?)";
		
			PreparedStatement  pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, 25);
			pstmt.setString(2,"Varuna" );
			pstmt.setString(3, "Varun@720");
				pstmt.execute();
				
				System.out.println("Data inserted");
			
			}  catch (SQLException e) {
				e.printStackTrace();
			}
		finally {
			try {
				//if(con !=null)
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		}
	}



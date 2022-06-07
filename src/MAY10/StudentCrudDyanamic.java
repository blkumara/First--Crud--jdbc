package MAY10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentCrudDyanamic {
	MyHelper m=new MyHelper();
	
	public void saveStudent(int id,String name,String email)
	{
		Connection con=m.getConnectionObj();
		String sql="Insert into student values(?,?,?)";
		try {

		
		PreparedStatement  pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setString(2,name );
		pstmt.setString(3, email);
			pstmt.execute();
			con.close();
			System.out.println("Data inserted");
		
		}  catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void deleteStudentById(int id)
	{
		Connection con=m.getConnectionObj();
		String sql="Delete FROM student where id=?";
		
		try {

		
		PreparedStatement  pstmt=con.prepareStatement(sql);
			pstmt.execute(sql);
			con.close();
			System.out.println("Data deleted");	
	}
		 catch (SQLException e) {
				e.printStackTrace();
			}
	}
	public void updateStudent(int id, String name, String email)
	{
		Connection con=m.getConnectionObj();
		String sql="UPDATE  student SET name=?,email=? where id=?";
		
		try {
			PreparedStatement  pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1,name );
			pstmt.setString(2, email);
			pstmt.setInt(3, id);
				pstmt.execute();
				con.close();
				System.out.println("Data updated");
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void getStudentVById(int id)
	{
		String sql="SELECT * FROM student WHERE id=?";
		Connection con=m.getConnectionObj();
	
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			int id1=rs.getInt(1);
			String name=rs.getString(2);
			String email=rs.getString(3);
			System.out.println("Id Is:"+id1);
			System.out.println("Name Is:"+name);
			System.out.println("Email Is:"+email);
			System.out.println("******************");
			}
			con.close();
		} catch (SQLException e) {	
			e.printStackTrace();
		}
		
	}
		

}

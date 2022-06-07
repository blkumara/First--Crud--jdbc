package MAY10;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;


	public class HelperStudent {
		MyHelper m=new MyHelper();
		Connection con=m.getConnectionObj();
		public void saveStudent(int id,String name,String email)
		{
			try {

			
			Statement  stmt=con.createStatement();
				String sql="Insert into student values("+id+",'"+name+"','"+email+"')";
				stmt.execute(sql);
				con.close();
				System.out.println("Data Saved");
			
			}  catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
//		void getAllStudent()
//		{
//			try {
//				Statement stmt=con.createStatement();
//				String sql="SELECT * FRON student";
//				ResultSet rs=stmt.executeQuery(sql);
//				
//				while(rs.next())
//				{
//					int id=rs.getInt(1);
//					String name=rs.getString(2);
//					String email=rs.getString(3);
//					System.out.println("Id Is:"+id);
//					System.out.println("Name Is:"+name);
//					System.out.println("Email Is:"+email);
//					System.out.println("******************");
//				}
//				con.close();
//				
//				
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			
//		}
		void printStudentById(int id)
		{
			try
			{
			Statement stmt=con.createStatement();
			String sql=("SELECT * FROM STUDENT WHERE ID="+id);
			ResultSet rs=stmt.executeQuery(sql);
			//while(rs.next())
			//or
			if(rs.next())
			{
			int id1=rs.getInt(1);
			String name=rs.getString(2);
			String email=rs.getString(3);
			
			System.out.println("Id Is:"+id1);
			System.out.println("Name Is:"+name);
			System.out.println("Email Is:"+email);
			System.out.println("******************");
			}
			else
			{
				System.out.println("No data for given id"+id);
			}
		
		con.close();
			}
			
		catch (SQLException e) {
			e.printStackTrace();
		}
			
		}
		void updateStudentName(String name,int id) 
		{
			try
			{
			Statement stmt=con.createStatement();
			String sql="UPDATE student SET name='"+ name+"'where id="+id;
			stmt.execute(sql);
			//while(rs.next())
			//or
			
		
		con.close();
			
			System.out.println("Data Updated");
			}
		catch (SQLException e) {
			e.printStackTrace();
		}
			
		}
		void updateStudentEmail(String email,int id) 
		{
			try
			{
			Statement stmt=con.createStatement();
			String sql="UPDATE student SET email='"+ email+"'where id="+id;
			stmt.execute(sql);
			//while(rs.next())
			//or
			
		
		con.close();
			
			System.out.println("Data Updated");
			}
		catch (SQLException e) {
			e.printStackTrace();
		}
			
		}
			
		
	}

				

		


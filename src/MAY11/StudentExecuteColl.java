package MAY11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import MAY10.MyHelper;

public class StudentExecuteColl {
	
	MyHelper myHelper= new MyHelper();
	
	Connection connection=myHelper.getConnectionObj();
	List<Student> list=new ArrayList();
	
	public List<Student> getStudent()
	{
		String sql="Select * from student";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ArrayList<Student> arrayList=new ArrayList<Student>();
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				int id=resultSet.getInt(1);
				String name=resultSet.getString(2);
				String email=resultSet.getString(3);
				
				Student student=new Student();
				student.setId(id);
				student.setName(name);
				student.setEmail(email);
				list.add(student);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	

}

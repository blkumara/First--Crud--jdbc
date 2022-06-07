package MAY11;

import java.util.List;

public class StudentDriverColl {
public static void main(String[] args) {
	StudentExecuteColl studentExecuteColl=new StudentExecuteColl();
	
	List<Student> list=studentExecuteColl.getStudent();
	System.out.println(list);
}
}

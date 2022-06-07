package MAY11;

public class StudentDriver {
	public static void main(String[] args) {
		

	
	StudentData data=new StudentData();
	
	Student s=new Student();
	
	s.setId(1);
	s.setName("Kumar");
	s.setEmail("blkumara701@gmail.com");
	s.setAddress("Hassan");
	
	data.saveStudent(s);
	
	}
}

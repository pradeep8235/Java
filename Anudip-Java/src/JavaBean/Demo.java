package JavaBean;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student();
		//System.out.println(s.studentId);
		//System.out.println(s.studentName);
		s.setId(100);
		System.out.println(s.getId());
		s.setName("Lokesh");
		System.out.println(s.getName());
		
		
		Student1 s1 = new Student1();
		s1.setStudentId(500);
		System.out.println(s1.getStudentId());
		s1.setStudentName("Harish");
		System.out.println(s1.getStudentName());
	}
}

package ch02_6;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		
		String data= studentLee.showStudentInfo();
		System.out.println(data);

		Student studentKim= new Student(12345, "kim", 3);
		System.out.println(studentKim.showStudentInfo());
	}

}

package ch02_8;

public class ClassTest {

	public static void main(String[] args) {
		Person person= new Person("tomas", 180, 78, "m");
		
		String data= person.info();
		System.out.println(data);
	}

}

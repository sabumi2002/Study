package ch04_03;

public class StringTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("java");
		
		System.out.println(java== android);
		System.out.println(java.equals(android));
	}

}

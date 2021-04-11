package ch04_03;

public class StringBiulderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuffer buffer= new StringBuffer(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));
		
		
		String test= buffer.toString();
		System.out.println(test);
		
	}

}

package ch02_23;


import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("태박산맥1 ", "조정래"));
		library.add(new Book("태박산맥2 ", "조정래"));
		library.add(new Book("태박산맥3 ", "조정래"));
		
		for(int i= 0; i< library.size(); i++) {
			library.get(i).showInfo();
		}
	}

}

package ch02_23;


import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("�¹ڻ��1 ", "������"));
		library.add(new Book("�¹ڻ��2 ", "������"));
		library.add(new Book("�¹ڻ��3 ", "������"));
		
		for(int i= 0; i< library.size(); i++) {
			library.get(i).showInfo();
		}
	}

}

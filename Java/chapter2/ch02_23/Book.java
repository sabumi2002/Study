package ch02_23;

public class Book {
	String bookName, name;
	
	public Book(String bookName, String name) {
		this.bookName= bookName;
		this.name= name;
	}
	public void showInfo() {
		System.out.println(bookName+ name);
	}
}

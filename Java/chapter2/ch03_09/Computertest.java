package ch03_09;

public class Computertest {

	public static void main(String[] args) {
		
		Computer desktop = new Desktop();
		Computer MynoteBook = new MyNoteBook();
		
		
		desktop.display();
		MynoteBook.turnOn();
	}

}

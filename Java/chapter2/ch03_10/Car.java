package ch03_10;

public abstract class Car {
	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	
	public abstract void drive();
	
	public abstract void stop();
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}

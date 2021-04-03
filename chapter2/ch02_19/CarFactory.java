package ch02_19;

public class CarFactory {
	static int serialNum= 10000;
	
	private static CarFactory instance = new CarFactory();

	public CarFactory() {
		
	}



	

	public static CarFactory getInstance() {
		if(instance == null)
			instance = new CarFactory();
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		car.number= serialNum++;
		return car;
	}
}

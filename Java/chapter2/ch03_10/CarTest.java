package ch03_10;

public class CarTest {

	public static void main(String[] args) {
		Car aiCar = new AICar();
		Car manualCar = new ManualCar();
		
		aiCar.run();
		manualCar.run();
	}

}

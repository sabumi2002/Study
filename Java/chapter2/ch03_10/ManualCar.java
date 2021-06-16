package ch03_10;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("오빠 달려~");
	}

	@Override
	public void stop() {
		System.out.println("야 타");
	}

}

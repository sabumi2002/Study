package ch03_16.ex_inheritance;

public class BeginnerLevel extends PlayerLevel{
	
	BeginnerLevel(){
		count = 1;
	}
	
	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
		System.out.println(count);
	}

	@Override
	public void jump() {
		System.out.println("Jump 못하지롱");
	}

	@Override
	public void turn() {
		System.out.println("Turn 못하지롱");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 초급자 레벨입니다. ******");
	}

}

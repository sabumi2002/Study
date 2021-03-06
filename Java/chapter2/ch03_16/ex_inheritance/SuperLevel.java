package ch03_16.ex_inheritance;

public class SuperLevel extends PlayerLevel{
	SuperLevel(){
		count =3;
	}
	
	@Override
	public void run() {
		System.out.println("엄청 빠르게 달립니다.");
		System.out.println(count);
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("turn 합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** 고급자 레벨입니다. ******");
	}

}

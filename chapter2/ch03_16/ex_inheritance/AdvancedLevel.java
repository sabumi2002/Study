package ch03_16.ex_inheritance;

public class AdvancedLevel extends PlayerLevel{
	
	AdvancedLevel(){
		count =2;
	}
	
	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
		System.out.println(count);
	}

	@Override
	public void jump() {
		System.out.println("���� jump �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("turn ��������");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** �߱��� �����Դϴ�. ******");
	}

}

package ch03_16.ex_inheritance;

public class BeginnerLevel extends PlayerLevel{
	
	BeginnerLevel(){
		count = 1;
	}
	
	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
		System.out.println(count);
	}

	@Override
	public void jump() {
		System.out.println("Jump ��������");
	}

	@Override
	public void turn() {
		System.out.println("Turn ��������");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** �ʱ��� �����Դϴ�. ******");
	}

}

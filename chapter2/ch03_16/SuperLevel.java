package ch03_16;

public class SuperLevel extends PlayerLevel{
	SuperLevel(){
		count =3;
	}
	
	@Override
	public void run() {
		System.out.println("��û ������ �޸��ϴ�.");
		System.out.println(count);
	}

	@Override
	public void jump() {
		System.out.println("���� ���� jump �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("turn �մϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****** ����� �����Դϴ�. ******");
	}

}

package ch03_16.ex_interface;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("���� �ְų� �������� �Ҵ�� ��ȭ ���� ���� ���� �������� ����մϴ�.");		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ������ �������� ����մϴ�.");				
	}

}

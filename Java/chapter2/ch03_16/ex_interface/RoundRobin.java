package ch03_16.ex_interface;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("��� ������ ������ ��� �Ǽ��� ó���ϵ��� ���� ������� ����մϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ������ �������� ����մϴ�.");				
	}

}

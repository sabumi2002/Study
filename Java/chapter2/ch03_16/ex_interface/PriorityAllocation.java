package ch03_16.ex_interface;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("���� ��޿� ���� ����� ���� ���� �����ɷ��� ����� �������� ����մϴ�.");		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ������ �������� ����մϴ�.");		
	}

}

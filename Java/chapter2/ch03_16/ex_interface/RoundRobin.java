package ch03_16.ex_interface;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("모든 상담원이 동일한 상담 건수를 처리하도록 상담원 순서대로 배분합니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서의 상담원에게 배분합니다.");				
	}

}

package ch03_16.ex_interface;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("쉬고 있거나 상담원에게 할당된 통화 수가 가장 적은 상담원에게 배분합니다.");		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서의 상담원에게 배분합니다.");				
	}

}

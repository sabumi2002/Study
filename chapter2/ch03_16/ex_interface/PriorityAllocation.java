package ch03_16.ex_interface;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("고객의 등급에 따라 등급이 높은 고객은 업무능력이 우수한 상담원에게 배분합니다.");		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서의 상담원에게 배분합니다.");		
	}

}

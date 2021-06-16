package ch02_14;

public class Bus {
	int number, pay, usePerson=0, income;
	
	Bus(int number, int pay){
		this.number= number;
		this.pay= pay;
	}
	
	public int Ride() {
		usePerson++;
		income+= pay;
		return pay;
	}
	public String getInfo(){
		return number+ "번 버스의 승객은 "+ usePerson+ "명 이고, 수입은 "+ income+ "원 입니다.";
	}
}

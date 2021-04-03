package ch02_14;

public class Subway {
	String color;
	int pay, usePerson=0, income;
	
	Subway(String color, int pay){
		this.color= color;
		this.pay= pay;
	}
	
	public int Ride() {
		usePerson++;
		income += pay;
		return pay;
	}
	public String getInfo(){
		return color+ "번 버스의 승객은 "+ usePerson+ "명 이고, 수입은 "+ income+ "원 입니다.";
	}
}

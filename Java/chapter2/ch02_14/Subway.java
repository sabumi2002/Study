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
		return color+ "�� ������ �°��� "+ usePerson+ "�� �̰�, ������ "+ income+ "�� �Դϴ�.";
	}
}

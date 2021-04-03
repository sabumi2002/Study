package ch02_14;

public class Person {
	String name;
	int money;
	
	Person(){
	}
	Person(String name, int money){
		this.name= name;
		this.money= money;
	}
	public void setMoney(int pay) {
		this.money -= pay;
	}
	
	public int getMoney() {
		return money;
	}
	public String getName() {
		return name;
	}
	public String getInfo() {
		return name+ "님의 남은 돈은 "+ money+ "원 입니다.";
	}
}

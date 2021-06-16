package ch02_8;

public class Person {
	int height, weight;
	String sex, name;
	public Person() {}
	public Person(String name, int height, int weight, String sex) {
		this.name= name;
		this.height= height;
		this.weight= weight;
		this.sex= sex;
	}
	
	public String info() {
		return "키가 "+ height+ " 이고 몸무게가 "+ weight+ " 킬로인 남성이 있습니다. 이름은 "+ name+"입니다.";
	}
}

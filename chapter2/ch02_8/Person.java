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
		return "Ű�� "+ height+ " �̰� �����԰� "+ weight+ " ų���� ������ �ֽ��ϴ�. �̸��� "+ name+"�Դϴ�.";
	}
}

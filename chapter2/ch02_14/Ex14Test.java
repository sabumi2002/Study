package ch02_14;

import java.util.ArrayList;

public class Ex14Test {

	public static void main(String[] args) {
		
		Bus bus_100 = new Bus(100, 1000);
		Subway subway_Green = new Subway("Green", 1200);
		
		Person person[]= new Person[5];
		person[0]= new Person("James", 10000);
		person[1]= new Person("Tomas", 10000);
		
		person[0].setMoney(bus_100.Ride());
		person[1].setMoney(subway_Green.Ride());
		person[0].setMoney(bus_100.Ride());
		person[1].setMoney(subway_Green.Ride());
		person[0].setMoney(bus_100.Ride());
		person[1].setMoney(subway_Green.Ride());
		
		System.out.println(person[0].getInfo());
		System.out.println(person[1].getInfo());
		System.out.println(bus_100.getInfo());
		System.out.println(subway_Green.getInfo());
	}
	
	

}

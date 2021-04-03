package ch02_24;

import java.util.ArrayList;

public class Ex_arrayListTest {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student("Lee"));
		studentList.add(new Student("Kim"));
		
		studentList.get(0).addSubject("����", 100);
		studentList.get(0).addSubject("����", 50);
		studentList.get(1).addSubject("����", 70);
		studentList.get(1).addSubject("����", 85);
		studentList.get(1).addSubject("����", 100);
		
		for(Student student : studentList) {
			student.showInfo();
		}
		/*
		System.out.println(studentList.get(0).showInfo());
		System.out.println(studentList.get(1).showInfo());
		*/
	}

}
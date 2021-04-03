package ch02_24;

import java.util.ArrayList;

public class Student {
	private static int nowStudentID= 10000;
	private int studentID;
	private String name;
	ArrayList<Subject> subjectList;
	
	public Student(String name) {
		this.studentID= this.nowStudentID++;
		this.name= name;
		subjectList = new ArrayList<>(); 
	}
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.subjectName= name;
		subject.subjectScore= score;
		
		subjectList.add(subject);
	}
	
	public void showInfo() {
		String showString = "";
		int total = 0;
		/*
		for(int i=0; i< subjectList.size(); i++) {
			showString += "�й� "+studentID +" " + name+ "�� "+ subjectList.get(i).subjectName+ " ���� ������ "+ subjectList.get(i).subjectScore+ "�Դϴ�.\n";
			total += subjectList.get(i).subjectScore;
		}
		showString+= "������ "+ total+"�Դϴ�.";
		return showString;
		*/
		for(Subject subject: subjectList) {
			total += subject.subjectScore;
			System.out.println(name+ "�л��� "+ subject.subjectName+ " ������ ������ "+ subject.subjectScore+ "�Դϴ�.");
		}
		System.out.println(name+ "�л��� ������ "+ total+ "�� �Դϴ�.");
		
	}
	
}

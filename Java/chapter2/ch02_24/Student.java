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
			showString += "학번 "+studentID +" " + name+ "의 "+ subjectList.get(i).subjectName+ " 과목 성적은 "+ subjectList.get(i).subjectScore+ "입니다.\n";
			total += subjectList.get(i).subjectScore;
		}
		showString+= "총점은 "+ total+"입니다.";
		return showString;
		*/
		for(Subject subject: subjectList) {
			total += subject.subjectScore;
			System.out.println(name+ "학생의 "+ subject.subjectName+ " 과목의 성적은 "+ subject.subjectScore+ "입니다.");
		}
		System.out.println(name+ "학생의 총점은 "+ total+ "점 입니다.");
		
	}
	
}

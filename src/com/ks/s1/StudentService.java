package com.ks.s1;

import java.util.Scanner;

public class StudentService {
	
	private Object addPoint;
	//학생추가 메서드
	//메서드명 addStudent
	//학생의 인원수를 입력
	//학생수만큼
	//이름입력
	//번호입력
	//schoolcontroller쪽으로 가져와서 2번에
	
	public Student [] addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("인원을 입력하세요");
		int num = sc.nextInt();
		Student [] c = new Student[num];
		for(int a = 0; a<c.length; a++) {// num = c.length
			Student stu = new Student();
			System.out.println("이름 입력");
			stu.name = sc.next();
			System.out.println("번호 입력");
			stu.num = sc.nextInt();
			c[a]=stu;
		}
		return c;
	}
	//메서드명 addPoint
	//각 학생의 점수 입력(국,영,수)
	public Student [] addPoint(Student [] c) {
		Scanner sc = new Scanner(System.in);
		StudentService b = new StudentService();
		SchoolController sr = new SchoolController();
				for(int a = 0; a<c.length; a++) {
			Student st = new Student();
			System.out.println(c[a].name+"학생의 국어점수를 입력하세요");
			c[a].kor = sc.nextInt();
			System.out.println(c[a].name+"번쨰 학생의 영어점수를 입력하세요");
			c[a].eng = sc.nextInt();
			System.out.println(c[a].name+"번쨰 학생의 수학점수를 입력하세요");
			c[a].math = sc.nextInt();
			c[a].total = c[a].kor +c[a].eng+c[a].math;
			c[a].avg = c[a].total/3.0;
		}
		return c;
	}
	
}

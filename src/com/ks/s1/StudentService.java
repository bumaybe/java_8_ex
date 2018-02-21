package com.ks.s1;

import java.util.Scanner;

public class StudentService {
	
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
	public Student [] addPoint(Student [] students) {
		Scanner sc = new Scanner(System.in);
				for(int a = 0; a<students.length; a++) {
			System.out.println(students[a].name+"학생의 국어점수를 입력하세요");
			students[a].kor = sc.nextInt();
			System.out.println(students[a].name+"번쨰 학생의 영어점수를 입력하세요");
			students[a].eng = sc.nextInt();
			System.out.println(students[a].name+"번쨰 학생의 수학점수를 입력하세요");
			students[a].math = sc.nextInt();
			students[a].total = students[a].kor +students[a].eng+students[a].math;
			students[a].avg = students[a].total/3.0;
		}
		return students;
	}
	
	//메서드명 search
	//번호를 입력받아서
	//학생 한명을 찾아서
	//해당학생 출력은 StudentView에서 viewStudent메서드에서 출력
	
	public Student search(Student [] students) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("번호를 입력하세요");
		int a = sc.nextInt();
		for(i = 0; i<students.length; i++) {
			if(students[i].num==a) {
				break;
			}
		}
		return students[i];
	}
}

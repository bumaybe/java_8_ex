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
}

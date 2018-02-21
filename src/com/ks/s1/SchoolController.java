package com.ks.s1;

import java.util.Scanner;

public class SchoolController {

	//메서드명은 start
	//리턴은 x
	//내용
	//1.학생등록
	//2.성적입력
	//3.성적조회
	//4.전체조회
	//5.프로그램종료

	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentService s = new StudentService();
		Student [] students = null;
		StudentView v = new StudentView();
		boolean check = true;

		while(check) {
			System.out.println("1.학생등록");
			System.out.println("2.성적입력");
			System.out.println("3.성적조회");
			System.out.println("4.전체조회");
			System.out.println("5.프로그램종료");

			int a = sc.nextInt();

			switch(a) {

			case 1:
				System.out.println("학생등록");
				students = s.addStudent();
				break;
			case 2:
				System.out.println("성적 입력");
				s.addPoint(students);
				break;
			case 3:
				System.out.println("성적조회");
				Student y = s.search(students);
				v.viewStudent(y);
				break;
			case 4:
				System.out.println("전체조회");
				v.view(students);
				break;
			case 5:
				System.out.println("프로그램종료");
				check = false;
				break;
			default:
				System.out.println("번호를 잘못선택했습니다");
				check = false;

			}
		}
	}
}

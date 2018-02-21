package com.ks.s1;

public class StudentView {


	//학생들의 정보를 출력
	//메서드명 view

	public void view(Student [] students) {

		for(int i =0; i<students.length ; i++) {

			System.out.println("이름 :" +students[i].name);
			System.out.println("번호 :" +students[i].num);
			System.out.println("국어 :" +students[i].kor);
			System.out.println("영어 :"+students[i].eng);
			System.out.println("수학 :"+students[i].math);
			System.out.println("총합 :"+students[i].total);
			System.out.println("평균 :"+students[i].avg);
		}
	}

	public void viewStudent(Student y) {
		System.out.println("국어 :" +y.kor);
		System.out.println("영어 :"+y.eng);
		System.out.println("수학 :"+y.math);
		System.out.println("총합 :"+y.total);
		System.out.println("평균 :"+y.avg);
	}
}

package com.ks.s1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Program Start");
		SchoolController s = new SchoolController();
		s.start(); //한번쓰고 더이상 안쓸때 이런 형태로 쓴다
		//s.start();
		
		//객체: 눈에 보이는 사물또는 개념
		//학생 : 3명 / 1명당 object
/*		Scanner sc = new Scanner(System.in);
		Student [] ar = new Student[2];
		Student student = new Student();
		
		for(int i =0; i<ar.length; i++) {
			student.name = sc.next();
			ar[i] = student;
			System.out.println(ar[i].name);
		}
		System.out.println("===================");
		
		for(int i=0;i<ar.length ;i++) {
			student = new Student();
			student.name = sc.next();
			ar[i] = student;
			System.out.println(ar[i].name);
		}*/
	//위의 for문과 아래의 for문은 큰 차이가 있다.
	}
	

}

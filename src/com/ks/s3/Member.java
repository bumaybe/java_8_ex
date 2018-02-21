package com.ks.s3;

public class Member {

	String name;
	int age;
	
	public Member() { //생성자
		System.out.println("생성자실행");
		System.out.println("멤버변수의 초기화담당");
		name = "iu";
		age = 26;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(age);
	}
}
